/*
 * Copyright (c) 2018 Oracle. All rights reserved.
 *
 * This material is the confidential property of Oracle Corporation or its
 * licensors and may be used, reproduced, stored or transmitted only in
 * accordance with a valid Oracle license or sublicense agreement.
 */

package charley.wu.geektime.spider;

import org.apache.http.client.config.CookieSpecs;

public class SpiderConfig {

  /* Request config */
  private String cookiePolicy = CookieSpecs.STANDARD; //Cookie policy
  private int socketTimeout = 20000;  //Socket timeout in milliseconds
  private int connectionTimeout = 30000;  //Connection timeout in milliseconds

  /* Proxy config */
  private String proxyHost; //Proxy host
  private int proxyPort = 80; //Proxy port


  public String getCookiePolicy() {
    return cookiePolicy;
  }

  public void setCookiePolicy(String cookiePolicy) {
    this.cookiePolicy = cookiePolicy;
  }

  public int getSocketTimeout() {
    return socketTimeout;
  }

  public void setSocketTimeout(int socketTimeout) {
    this.socketTimeout = socketTimeout;
  }

  public int getConnectionTimeout() {
    return connectionTimeout;
  }

  public void setConnectionTimeout(int connectionTimeout) {
    this.connectionTimeout = connectionTimeout;
  }

  public String getProxyHost() {
    return proxyHost;
  }

  public void setProxyHost(String proxyHost) {
    this.proxyHost = proxyHost;
  }

  public int getProxyPort() {
    return proxyPort;
  }

  public void setProxyPort(int proxyPort) {
    this.proxyPort = proxyPort;
  }
}
