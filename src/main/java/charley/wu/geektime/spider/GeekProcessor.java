package charley.wu.geektime.spider;

import charley.wu.geektime.spider.common.Constants;
import charley.wu.geektime.spider.entity.Article;
import charley.wu.geektime.spider.entity.Catalog;
import charley.wu.geektime.spider.entity.Column;
import charley.wu.geektime.spider.fetcher.FetcherResult;
import charley.wu.geektime.spider.fetcher.PageFetcher;
import charley.wu.geektime.spider.parser.PageParser;
import charley.wu.geektime.spider.parser.ParseResult;
import com.alibaba.fastjson.JSONObject;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 功能描述
 *
 * @author Charley
 * @since 1.0
 */
public class GeekProcessor {

  private static final Logger logger = LoggerFactory.getLogger(GeekProcessor.class);

  private PageFetcher pageFetcher;

  public GeekProcessor(PageFetcher pageFetcher) {
    this.pageFetcher = pageFetcher;
  }

  public void process() throws IOException {
    FetcherResult listResponse = pageFetcher.fetcher(Constants.FIRST_PAGE);
    ParseResult parseResult = new ParseResult();
    PageParser.parseList(loadEntity(listResponse.getEntity()), parseResult);

    for(Column column : parseResult.getColumns()){
      JSONObject params = new JSONObject();
      params.put("cid", column.getId());
      params.put("size", 200);
      params.put("prev", 0);
      params.put("order", "earliest");
      params.put("sample", false);
      FetcherResult columnResult = pageFetcher.fetcher(Catalog.URL_PREFIX, params);
      PageParser.parseCatalog(loadEntity(columnResult.getEntity()), column);

      for(Catalog catalog : column.getCatalogs()){
        JSONObject artParams = new JSONObject();
        artParams.put("id", catalog.getId());
        artParams.put("include_neighbors", true);
        FetcherResult artColumnResult = pageFetcher.fetcher(Article.URL_PREFIX, artParams);
        PageParser.parseArticle(loadEntity(artColumnResult.getEntity()));
      }
    }

  }

  private String loadEntity(HttpEntity entity) throws IOException{
    return EntityUtils.toString(entity, Constants.UTF8);
  }
}
