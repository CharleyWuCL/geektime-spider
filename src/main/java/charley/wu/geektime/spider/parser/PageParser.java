package charley.wu.geektime.spider.parser;

import charley.wu.geektime.spider.entity.Catalog;
import charley.wu.geektime.spider.entity.BaseClass;
import charley.wu.geektime.spider.entity.Column;
import charley.wu.geektime.spider.entity.Micro;
import charley.wu.geektime.spider.entity.Other;
import charley.wu.geektime.spider.entity.Video;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.TypeReference;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 页面解析器
 *
 * @author Charley
 * @since 1.0
 */
public class PageParser {

  private static final Logger logger = LoggerFactory.getLogger(PageParser.class);

  /**
   * 解析文章列表
   *
   * @param content       列表JSON
   * @param parseResult   解析结果
   */
  public static void parseList(String content, ParseResult parseResult){
    //解析专栏数据
    JSONArray columnJson = (JSONArray) JSONPath.read(content, "$.data.1.list");
    List<Column> columns = columnJson.toJavaObject(new TypeReference<List<Column>>(){});
    parseResult.setColumns(columns);
    parseResult.setColumnCount(columns.size());

    //解析微课数据
    JSONArray microJson = (JSONArray) JSONPath.read(content, "$.data.2.list");
    List<Micro> micros = microJson.toJavaObject(new TypeReference<List<Micro>>(){});
    parseResult.setMicros(micros);
    parseResult.setMicroCount(micros.size());

    //解析视频数据
    JSONArray videoJson = (JSONArray) JSONPath.read(content, "$.data.3.list");
    List<Video> videos = videoJson.toJavaObject(new TypeReference<List<Video>>(){});
    parseResult.setVideos(videos);
    parseResult.setVideoCount(videos.size());

    //解析其他数据
    JSONArray otherJson = (JSONArray) JSONPath.read(content, "$.data.4.list");
    List<Other> others = otherJson.toJavaObject(new TypeReference<List<Other>>(){});
    parseResult.setOthers(others);
    parseResult.setOtherCount(others.size());
  }

  /**
   * 解析文章目录
   *
   * @param content 网页内容
   * @param clazz 课程
   */
  public static void parseCatalog(String content, BaseClass clazz){
    JSONArray articleJson = (JSONArray) JSONPath.read(content, "$.data.list");
    List<Catalog> catalogs = articleJson.toJavaList(Catalog.class);
    clazz.setArticles(catalogs);
  }
}
