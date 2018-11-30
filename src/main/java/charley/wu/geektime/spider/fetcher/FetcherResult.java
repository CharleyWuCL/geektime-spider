package charley.wu.geektime.spider.fetcher;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能描述
 *
 * @author Charley
 * @since 1.0
 */
public class FetcherResult {
  private static final Logger logger = LoggerFactory.getLogger(FetcherResult.class);

  private int statusCode;
  private HttpEntity entity = null;
  private Header[] responseHeaders = null;
  private String fetchedUrl = null;
  private String movedToUrl = null;

  public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public HttpEntity getEntity() {
    return entity;
  }

  public void setEntity(HttpEntity entity) {
    this.entity = entity;
  }

  public Header[] getResponseHeaders() {
    return responseHeaders;
  }

  public void setResponseHeaders(Header[] responseHeaders) {
    this.responseHeaders = responseHeaders;
  }

  public String getFetchedUrl() {
    return fetchedUrl;
  }

  public void setFetchedUrl(String fetchedUrl) {
    this.fetchedUrl = fetchedUrl;
  }

  public String getMovedToUrl() {
    return movedToUrl;
  }

  public void setMovedToUrl(String movedToUrl) {
    this.movedToUrl = movedToUrl;
  }
}
