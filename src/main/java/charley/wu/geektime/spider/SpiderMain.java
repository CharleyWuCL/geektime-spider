/*
 * Copyright (c) 2018 Oracle. All rights reserved.
 *
 * This material is the confidential property of Oracle Corporation or its
 * licensors and may be used, reproduced, stored or transmitted only in
 * accordance with a valid Oracle license or sublicense agreement.
 */

package charley.wu.geektime.spider;

import java.util.HashMap;

/**
 * Main class.
 *
 * @author Charley Wu
 */
public class SpiderMain {

  public static void main(String[] args) {

    SpiderConfig config = new SpiderConfig();
    GeekTimeFetcher httpsTest = new GeekTimeFetcher(config);
    httpsTest.sendHttpsPost("https://time.geekbang.org/serv/v1/column/all", new HashMap<>());

    System.out.println("This is spider main!");
  }
}
