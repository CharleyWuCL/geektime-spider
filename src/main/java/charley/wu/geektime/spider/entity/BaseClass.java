package charley.wu.geektime.spider.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * 基础对象
 *
 * @author Charley
 * @since 1.0
 */
public class BaseClass {

  private String updateFrequency;
  private boolean isPreorder;
  private String authorIntro;
  private String columnBgcolor;
  private long columnPriceMarket;
  private boolean isExperience;
  private String authorHeader;
  private String columnTitle;
  private boolean isIncludeAudio;
  private String columnUnit;
  private long columnPrice;
  private String columnCover;
  private boolean isShareget;
  private long columnBeginTime;
  private String columnSubtitle;
  private long subCount;
  private boolean hadSub;
  private long id;
  private String authorName;

  private List<Catalog> catalogs = new ArrayList<>();

  public String getUpdateFrequency() {
    return updateFrequency;
  }

  public void setUpdateFrequency(String updateFrequency) {
    this.updateFrequency = updateFrequency;
  }

  public boolean isPreorder() {
    return isPreorder;
  }

  public void setPreorder(boolean preorder) {
    isPreorder = preorder;
  }

  public String getAuthorIntro() {
    return authorIntro;
  }

  public void setAuthorIntro(String authorIntro) {
    this.authorIntro = authorIntro;
  }

  public String getColumnBgcolor() {
    return columnBgcolor;
  }

  public void setColumnBgcolor(String columnBgcolor) {
    this.columnBgcolor = columnBgcolor;
  }

  public long getColumnPriceMarket() {
    return columnPriceMarket;
  }

  public void setColumnPriceMarket(long columnPriceMarket) {
    this.columnPriceMarket = columnPriceMarket;
  }

  public boolean isExperience() {
    return isExperience;
  }

  public void setExperience(boolean experience) {
    isExperience = experience;
  }

  public String getAuthorHeader() {
    return authorHeader;
  }

  public void setAuthorHeader(String authorHeader) {
    this.authorHeader = authorHeader;
  }

  public String getColumnTitle() {
    return columnTitle;
  }

  public void setColumnTitle(String columnTitle) {
    this.columnTitle = columnTitle;
  }

  public boolean isIncludeAudio() {
    return isIncludeAudio;
  }

  public void setIncludeAudio(boolean includeAudio) {
    isIncludeAudio = includeAudio;
  }

  public String getColumnUnit() {
    return columnUnit;
  }

  public void setColumnUnit(String columnUnit) {
    this.columnUnit = columnUnit;
  }

  public long getColumnPrice() {
    return columnPrice;
  }

  public void setColumnPrice(long columnPrice) {
    this.columnPrice = columnPrice;
  }

  public String getColumnCover() {
    return columnCover;
  }

  public void setColumnCover(String columnCover) {
    this.columnCover = columnCover;
  }

  public boolean isShareget() {
    return isShareget;
  }

  public void setShareget(boolean shareget) {
    isShareget = shareget;
  }

  public long getColumnBeginTime() {
    return columnBeginTime;
  }

  public void setColumnBeginTime(long columnBeginTime) {
    this.columnBeginTime = columnBeginTime;
  }

  public String getColumnSubtitle() {
    return columnSubtitle;
  }

  public void setColumnSubtitle(String columnSubtitle) {
    this.columnSubtitle = columnSubtitle;
  }

  public long getSubCount() {
    return subCount;
  }

  public void setSubCount(long subCount) {
    this.subCount = subCount;
  }

  public Boolean getHadSub() {
    return hadSub;
  }

  public void setHadSub(Boolean hadSub) {
    this.hadSub = hadSub;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  public List<Catalog> getArticles() {
    return catalogs;
  }

  public void setArticles(List<Catalog> catalogs) {
    this.catalogs = catalogs;
  }

  @Override
  public String toString() {
    return "Column{" +
        "columnTitle='" + columnTitle + '\'' +
        ", id=" + id +
        ", authorName='" + authorName + '\'' +
        ", updateFrequency='" + updateFrequency + '\'' +
        ", isPreorder=" + isPreorder +
        ", authorIntro='" + authorIntro + '\'' +
        ", columnBgcolor='" + columnBgcolor + '\'' +
        ", columnPriceMarket=" + columnPriceMarket +
        ", isExperience=" + isExperience +
        ", isIncludeAudio=" + isIncludeAudio +
        ", columnUnit='" + columnUnit + '\'' +
        ", columnPrice=" + columnPrice +
        ", isShareget=" + isShareget +
        ", columnBeginTime=" + columnBeginTime +
        ", columnSubtitle='" + columnSubtitle + '\'' +
        ", subCount=" + subCount +
        ", hadSub=" + hadSub +
        '}';
  }
}
