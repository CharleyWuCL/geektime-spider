/*
 * Copyright (c) 2018 Oracle. All rights reserved.
 *
 * This material is the confidential property of Oracle Corporation or its
 * licensors and may be used, reproduced, stored or transmitted only in
 * accordance with a valid Oracle license or sublicense agreement.
 */

package charley.wu.geektime.spider.fetcher;

import charley.wu.geektime.spider.SpiderConfig;
import charley.wu.geektime.spider.common.Constants;
import com.alibaba.fastjson.JSONObject;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.HashSet;
import javax.net.ssl.SSLContext;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.ssl.SSLContextBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Geek time fetcher.
 *
 * @author Charley Wu
 */
public class PageFetcher {

  private static final Logger logger = LoggerFactory.getLogger(PageFetcher.class);
  private final SpiderConfig config;

  private CloseableHttpClient httpClient;

  public PageFetcher(SpiderConfig config) {
    this.config = config;

    //Default request config
    RequestConfig requestConfig = RequestConfig.custom()
        .setExpectContinueEnabled(false)
        .setCookieSpec(config.getCookiePolicy())
        .setRedirectsEnabled(false)
        .setSocketTimeout(config.getSocketTimeout())
        .setConnectTimeout(config.getConnectionTimeout())
        .build();

    HttpClientBuilder clientBuilder = HttpClientBuilder.create();
    clientBuilder.setDefaultRequestConfig(requestConfig);//Set request config
    clientBuilder.setSSLSocketFactory(createSSLConnSocketFactory());//Set SSL factory for https
    clientBuilder.setDefaultHeaders(createDefaultHeaders());//Set default headers

    //Set proxy config
    if (config.getProxyHost() != null) {
      HttpHost proxyHost = new HttpHost(config.getProxyHost(), config.getProxyPort());
      clientBuilder.setProxy(proxyHost);
    }

    httpClient = clientBuilder.build();
  }

  public FetcherResult fetcher(String url) {
    return fetcher(url, new JSONObject());
  }

  public FetcherResult fetcher(String url, JSONObject params) {
    FetcherResult fetchResult = new FetcherResult();
    try {
      HttpPost httpPost = new HttpPost(url);
      //Add params
//      List<NameValuePair> nvps = new ArrayList<>();
//      for (String key : params.keySet()) {
//        nvps.add(new BasicNameValuePair(key, params.get(key)));
//      }
//      httpPost.setEntity(new UrlEncodedFormEntity(nvps, Constants.UTF8));
      httpPost.setEntity(new StringEntity(params.toString(), Constants.UTF8));

      //Execute http request
      CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
      int status = httpResponse.getStatusLine().getStatusCode();
      if(status >= 200 && status <= 299){
        fetchResult.setFetchedUrl(url);
        fetchResult.setEntity(httpResponse.getEntity());
        fetchResult.setResponseHeaders(httpResponse.getAllHeaders());
        fetchResult.setStatusCode(status);
      }else{
        logger.info("This request is failed. Status: {}, URL: {}", status, fetchResult.getFetchedUrl());
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return fetchResult;
  }

  //创建SSL安全连接
  private static SSLConnectionSocketFactory createSSLConnSocketFactory() {
    SSLConnectionSocketFactory sslsf = null;
    try {
      SSLContext sslContext = new SSLContextBuilder()
          .loadTrustMaterial(null, (X509Certificate[] chain, String authType) -> true).build();
      sslsf = new SSLConnectionSocketFactory(sslContext, NoopHostnameVerifier.INSTANCE);
    } catch (GeneralSecurityException e) {
      e.printStackTrace();
    }
    return sslsf;
  }

  private HashSet<BasicHeader> createDefaultHeaders() {
    HashSet<BasicHeader> headers = new HashSet<>();
    headers.add(new BasicHeader("Accept", "application/json, text/plain, */*"));
    headers.add(new BasicHeader("Accept-Encoding", "gzip, deflate, br"));
    headers.add(new BasicHeader("Accept-Language",
        "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2"));
    headers.add(new BasicHeader("Content-Type", "application/json"));
//    headers.add(new BasicHeader("Connection", "keep-alive"));
    headers.add(new BasicHeader("Host", "time.geekbang.org"));
    headers.add(new BasicHeader("Origin", "https://time.geekbang.org"));
    headers.add(new BasicHeader("Referer", "https://time.geekbang.org/"));
    headers.add(new BasicHeader("User-Agent",
        "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36"));
//    headers.add(new BasicHeader("Cookie", "_ga=GA1.2.865898016.1541123906; GCID=9420193-13aaebb-86a631b-350b9c2; GCESS=BAIE5.7kWwoEAAAAAAYEruSXFgcEGL_nAgQEAC8NAAEEaI4SAAME5.7kWwwBAQgBAwUEAAAAAAsCBAAJAQE-; _gid=GA1.2.1049705451.1542006772; _gat=1; SERVERID=fe79ab1762e8fabea8cbf989406ba8f4|1542006781|1542006771; Hm_lvt_022f847c4e3acd44d4a2481d9187f1e6=1541743711,1542006772,1542006781; Hm_lpvt_022f847c4e3acd44d4a2481d9187f1e6=1542006781"));
    return headers;
  }

}
