package charley.wu.geektime.spider.common;

/**
 * 课程类别
 *
 * @author Charley
 * @since 1.0
 */
public enum ClassType {
  COLUMN(1, "专栏"),
  MICRO(2, "微课"),
  VIDEO(3, "视频"),
  OTHER(4, "其他");

  private int type;
  private String name;
  ClassType(int type, String name) {
    this.type = type;
    this.name = name;
  }
}
