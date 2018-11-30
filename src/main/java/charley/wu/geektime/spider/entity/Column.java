package charley.wu.geektime.spider.entity;

import charley.wu.geektime.spider.common.ClassType;

/**
 * 专栏
 *
 * @author Charley
 * @since 1.0
 */
public class Column extends BaseClass {
  public static final ClassType TYPE = ClassType.COLUMN;
  public static final String URL_PREFIX = "https://time.geekbang.org/serv/v1/column/articles";
}
