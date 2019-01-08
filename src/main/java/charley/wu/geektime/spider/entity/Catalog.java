package charley.wu.geektime.spider.entity;

/**
 * 功能描述
 *
 * @author Charley
 * @since 1.0
 */
public class Catalog {

  public static final String URL_PREFIX = "https://time.geekbang.org/serv/v1/column/articles";

  private String articleSubtitle;
  private long articleCtime;
  private long id;
  private String articleCover;
  private String articleTitle;
  private String articleSummary;
  private boolean hadViewed;
  private boolean articleCouldPreview;
  private String chapterId;
  private long score;

  public String getArticleSubtitle() {
    return articleSubtitle;
  }

  public void setArticleSubtitle(String articleSubtitle) {
    this.articleSubtitle = articleSubtitle;
  }

  public long getArticleCtime() {
    return articleCtime;
  }

  public void setArticleCtime(long articleCtime) {
    this.articleCtime = articleCtime;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getArticleCover() {
    return articleCover;
  }

  public void setArticleCover(String articleCover) {
    this.articleCover = articleCover;
  }

  public String getArticleTitle() {
    return articleTitle;
  }

  public void setArticleTitle(String articleTitle) {
    this.articleTitle = articleTitle;
  }

  public String getArticleSummary() {
    return articleSummary;
  }

  public void setArticleSummary(String articleSummary) {
    this.articleSummary = articleSummary;
  }

  public boolean isHadViewed() {
    return hadViewed;
  }

  public void setHadViewed(boolean hadViewed) {
    this.hadViewed = hadViewed;
  }

  public boolean isArticleCouldPreview() {
    return articleCouldPreview;
  }

  public void setArticleCouldPreview(boolean articleCouldPreview) {
    this.articleCouldPreview = articleCouldPreview;
  }

  public String getChapterId() {
    return chapterId;
  }

  public void setChapterId(String chapterId) {
    this.chapterId = chapterId;
  }

  public long getScore() {
    return score;
  }

  public void setScore(long score) {
    this.score = score;
  }

  @Override
  public String toString() {
    return "Catalog{" +
        "articleTitle='" + articleTitle + '\'' +
        ", id=" + id +
        ", articleSubtitle='" + articleSubtitle + '\'' +
        ", articleCtime=" + articleCtime +
        ", hadViewed=" + hadViewed +
        ", articleCouldPreview=" + articleCouldPreview +
        ", chapterId='" + chapterId + '\'' +
        ", score=" + score +
        '}';
  }
}
