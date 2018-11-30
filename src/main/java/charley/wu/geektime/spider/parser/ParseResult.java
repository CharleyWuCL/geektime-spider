package charley.wu.geektime.spider.parser;

import charley.wu.geektime.spider.entity.Column;
import charley.wu.geektime.spider.entity.Micro;
import charley.wu.geektime.spider.entity.Other;
import charley.wu.geektime.spider.entity.Video;
import java.util.ArrayList;
import java.util.List;

/**
 * 解析结果
 *
 * @author Charley
 * @since 1.0
 */
public class ParseResult {
  //专栏
  private List<Column> columns = new ArrayList<>();
  //微课
  private List<Micro> micros = new ArrayList<>();
  //视频
  private List<Video> videos = new ArrayList<>();
  //其他
  private List<Other> others = new ArrayList<>();

  //课程总数
  private int total = 0;
  private int columnCount = 0;
  private int microCount = 0;
  private int videoCount = 0;
  private int otherCount = 0;

  public void print(){
    columns.forEach(c -> System.out.println("专栏=> 课程名："+c.getColumnTitle()+"; 作者："+c.getAuthorName()+"; 课程号："+c.getId()));
    micros.forEach(c -> System.out.println("微课=> 课程名："+c.getColumnTitle()+"; 作者："+c.getAuthorName()+"; 课程号："+c.getId()));
    videos.forEach(c -> System.out.println("视频=> 课程名："+c.getColumnTitle()+"; 作者："+c.getAuthorName()+"; 课程号："+c.getId()));
    others.forEach(c -> System.out.println("其他=> 课程名："+c.getColumnTitle()+"; 作者："+c.getAuthorName()+"; 课程号："+c.getId()));
  }


  public List<Column> getColumns() {
    return columns;
  }

  public void setColumns(List<Column> columns) {
    this.columns = columns;
  }

  public List<Micro> getMicros() {
    return micros;
  }

  public void setMicros(List<Micro> micros) {
    this.micros = micros;
  }

  public List<Video> getVideos() {
    return videos;
  }

  public void setVideos(List<Video> videos) {
    this.videos = videos;
  }

  public List<Other> getOthers() {
    return others;
  }

  public void setOthers(List<Other> others) {
    this.others = others;
  }

  public int getTotal() {
    return columnCount + microCount + videoCount + otherCount;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getColumnCount() {
    return columnCount;
  }

  public void setColumnCount(int columnCount) {
    this.columnCount = columnCount;
  }

  public int getMicroCount() {
    return microCount;
  }

  public void setMicroCount(int microCount) {
    this.microCount = microCount;
  }

  public int getVideoCount() {
    return videoCount;
  }

  public void setVideoCount(int videoCount) {
    this.videoCount = videoCount;
  }

  public int getOtherCount() {
    return otherCount;
  }

  public void setOtherCount(int otherCount) {
    this.otherCount = otherCount;
  }
}
