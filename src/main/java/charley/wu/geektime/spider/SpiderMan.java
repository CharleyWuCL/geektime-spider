/*
 * Copyright (c) 2018 Oracle. All rights reserved.
 *
 * This material is the confidential property of Oracle Corporation or its
 * licensors and may be used, reproduced, stored or transmitted only in
 * accordance with a valid Oracle license or sublicense agreement.
 */

package charley.wu.geektime.spider;

import charley.wu.geektime.spider.fetcher.PageFetcher;
import java.io.IOException;

/**
 * Main class.
 *
 * @author Charley Wu
 */
public class SpiderMan {

  public static void main(String[] args) {
    try {
      SpiderConfig config = new SpiderConfig();
      PageFetcher pageFetcher = new PageFetcher(config);
      GeekProcessor processor = new GeekProcessor(pageFetcher);
      processor.process();
    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
