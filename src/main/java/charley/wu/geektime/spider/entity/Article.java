package charley.wu.geektime.spider.entity;

/**
 * 文章内容
 *
 * @author Charley
 * @since 1.0
 */
public class Article {

  public static final String URL_PREFIX = "https://time.geekbang.org/serv/v1/article";

  private String sku;
  private String videoCover;
  private String authorName;
  private String articleCover;
  private String productType;
  private String audioUrl;
  private String chapterId;
  private boolean columnHadSub;
  private String audioDubber;
  private String audioTime;
  private long videoHeight;
  private String articleContent;
  private boolean articleCoverHidden;
  private boolean columnIsExperience;
  private String score;
  private String videoMedia;
  private String articleSubtitle;
  private String audioDownloadUrl;
  private long id;
  private boolean hadViewed;
  private String articleTitle;
  private String columnBgcolor;
  private String articleSummary;
  private String articlePosterWxlite;
  private long likeCount;
  private boolean hadLiked;
  private String columnCover;
  private long columnId;
  private long productId;
  private String audioTitle;
  private long audioSize;
  private String audioMd5;
  private String videoTime;
  private String articleSharetitle;
  private long cid;
  private long videoSize;
  private long viewCount;
  private long videoWidth;
  private boolean columnCouldSub;
  private long articleCtime;
  private boolean articleCouldPreview;

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public String getVideoCover() {
    return videoCover;
  }

  public void setVideoCover(String videoCover) {
    this.videoCover = videoCover;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public String getArticleCover() {
    return articleCover;
  }

  public void setArticleCover(String articleCover) {
    this.articleCover = articleCover;
  }

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public String getAudioUrl() {
    return audioUrl;
  }

  public void setAudioUrl(String audioUrl) {
    this.audioUrl = audioUrl;
  }

  public String getChapterId() {
    return chapterId;
  }

  public void setChapterId(String chapterId) {
    this.chapterId = chapterId;
  }

  public boolean isColumnHadSub() {
    return columnHadSub;
  }

  public void setColumnHadSub(boolean columnHadSub) {
    this.columnHadSub = columnHadSub;
  }

  public String getAudioDubber() {
    return audioDubber;
  }

  public void setAudioDubber(String audioDubber) {
    this.audioDubber = audioDubber;
  }

  public String getAudioTime() {
    return audioTime;
  }

  public void setAudioTime(String audioTime) {
    this.audioTime = audioTime;
  }

  public long getVideoHeight() {
    return videoHeight;
  }

  public void setVideoHeight(long videoHeight) {
    this.videoHeight = videoHeight;
  }

  public String getArticleContent() {
    return articleContent;
  }

  public void setArticleContent(String articleContent) {
    this.articleContent = articleContent;
  }

  public boolean isArticleCoverHidden() {
    return articleCoverHidden;
  }

  public void setArticleCoverHidden(boolean articleCoverHidden) {
    this.articleCoverHidden = articleCoverHidden;
  }

  public boolean isColumnIsExperience() {
    return columnIsExperience;
  }

  public void setColumnIsExperience(boolean columnIsExperience) {
    this.columnIsExperience = columnIsExperience;
  }

  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public String getVideoMedia() {
    return videoMedia;
  }

  public void setVideoMedia(String videoMedia) {
    this.videoMedia = videoMedia;
  }

  public String getArticleSubtitle() {
    return articleSubtitle;
  }

  public void setArticleSubtitle(String articleSubtitle) {
    this.articleSubtitle = articleSubtitle;
  }

  public String getAudioDownloadUrl() {
    return audioDownloadUrl;
  }

  public void setAudioDownloadUrl(String audioDownloadUrl) {
    this.audioDownloadUrl = audioDownloadUrl;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public boolean isHadViewed() {
    return hadViewed;
  }

  public void setHadViewed(boolean hadViewed) {
    this.hadViewed = hadViewed;
  }

  public String getArticleTitle() {
    return articleTitle;
  }

  public void setArticleTitle(String articleTitle) {
    this.articleTitle = articleTitle;
  }

  public String getColumnBgcolor() {
    return columnBgcolor;
  }

  public void setColumnBgcolor(String columnBgcolor) {
    this.columnBgcolor = columnBgcolor;
  }

  public String getArticleSummary() {
    return articleSummary;
  }

  public void setArticleSummary(String articleSummary) {
    this.articleSummary = articleSummary;
  }

  public String getArticlePosterWxlite() {
    return articlePosterWxlite;
  }

  public void setArticlePosterWxlite(String articlePosterWxlite) {
    this.articlePosterWxlite = articlePosterWxlite;
  }

  public long getLikeCount() {
    return likeCount;
  }

  public void setLikeCount(long likeCount) {
    this.likeCount = likeCount;
  }

  public boolean isHadLiked() {
    return hadLiked;
  }

  public void setHadLiked(boolean hadLiked) {
    this.hadLiked = hadLiked;
  }

  public String getColumnCover() {
    return columnCover;
  }

  public void setColumnCover(String columnCover) {
    this.columnCover = columnCover;
  }

  public long getColumnId() {
    return columnId;
  }

  public void setColumnId(long columnId) {
    this.columnId = columnId;
  }

  public long getProductId() {
    return productId;
  }

  public void setProductId(long productId) {
    this.productId = productId;
  }

  public String getAudioTitle() {
    return audioTitle;
  }

  public void setAudioTitle(String audioTitle) {
    this.audioTitle = audioTitle;
  }

  public long getAudioSize() {
    return audioSize;
  }

  public void setAudioSize(long audioSize) {
    this.audioSize = audioSize;
  }

  public String getAudioMd5() {
    return audioMd5;
  }

  public void setAudioMd5(String audioMd5) {
    this.audioMd5 = audioMd5;
  }

  public String getVideoTime() {
    return videoTime;
  }

  public void setVideoTime(String videoTime) {
    this.videoTime = videoTime;
  }

  public String getArticleSharetitle() {
    return articleSharetitle;
  }

  public void setArticleSharetitle(String articleSharetitle) {
    this.articleSharetitle = articleSharetitle;
  }

  public long getCid() {
    return cid;
  }

  public void setCid(long cid) {
    this.cid = cid;
  }

  public long getVideoSize() {
    return videoSize;
  }

  public void setVideoSize(long videoSize) {
    this.videoSize = videoSize;
  }

  public long getViewCount() {
    return viewCount;
  }

  public void setViewCount(long viewCount) {
    this.viewCount = viewCount;
  }

  public long getVideoWidth() {
    return videoWidth;
  }

  public void setVideoWidth(long videoWidth) {
    this.videoWidth = videoWidth;
  }

  public boolean isColumnCouldSub() {
    return columnCouldSub;
  }

  public void setColumnCouldSub(boolean columnCouldSub) {
    this.columnCouldSub = columnCouldSub;
  }

  public long getArticleCtime() {
    return articleCtime;
  }

  public void setArticleCtime(long articleCtime) {
    this.articleCtime = articleCtime;
  }

  public boolean isArticleCouldPreview() {
    return articleCouldPreview;
  }

  public void setArticleCouldPreview(boolean articleCouldPreview) {
    this.articleCouldPreview = articleCouldPreview;
  }

  @Override
  public String toString() {
    return "Article{" +
        "sku='" + sku + '\'' +
        ", videoCover='" + videoCover + '\'' +
        ", authorName='" + authorName + '\'' +
        ", articleCover='" + articleCover + '\'' +
        ", productType='" + productType + '\'' +
        ", audioUrl='" + audioUrl + '\'' +
        ", chapterId='" + chapterId + '\'' +
        ", columnHadSub=" + columnHadSub +
        ", audioDubber='" + audioDubber + '\'' +
        ", audioTime='" + audioTime + '\'' +
        ", videoHeight=" + videoHeight +
        ", articleContent='" + articleContent + '\'' +
        ", articleCoverHidden=" + articleCoverHidden +
        ", columnIsExperience=" + columnIsExperience +
        ", score='" + score + '\'' +
        ", videoMedia='" + videoMedia + '\'' +
        ", articleSubtitle='" + articleSubtitle + '\'' +
        ", audioDownloadUrl='" + audioDownloadUrl + '\'' +
        ", id=" + id +
        ", hadViewed=" + hadViewed +
        ", articleTitle='" + articleTitle + '\'' +
        ", columnBgcolor='" + columnBgcolor + '\'' +
        ", articleSummary='" + articleSummary + '\'' +
        ", articlePosterWxlite='" + articlePosterWxlite + '\'' +
        ", likeCount=" + likeCount +
        ", hadLiked=" + hadLiked +
        ", columnCover='" + columnCover + '\'' +
        ", columnId=" + columnId +
        ", productId=" + productId +
        ", audioTitle='" + audioTitle + '\'' +
        ", audioSize=" + audioSize +
        ", audioMd5='" + audioMd5 + '\'' +
        ", videoTime='" + videoTime + '\'' +
        ", articleSharetitle='" + articleSharetitle + '\'' +
        ", cid=" + cid +
        ", videoSize=" + videoSize +
        ", viewCount=" + viewCount +
        ", videoWidth=" + videoWidth +
        ", columnCouldSub=" + columnCouldSub +
        ", articleCtime=" + articleCtime +
        ", articleCouldPreview=" + articleCouldPreview +
        '}';
  }
}
