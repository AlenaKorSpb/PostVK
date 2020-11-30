package ru.netology.domain;

public class Post {

    private int id;
    private int idOwnerPost;
    private String text;
    private int date;
    private int close;
    private String urlImg;
    private int commentsInfo;
    private int likesInfo;
    private int repostInfo;
    private int countViews;
    private int geoInfo;
    private int interestsInfo;
    private int isPinned;
    private int markedAsAds;
    private String copyright;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdOwnerPost() {
        return idOwnerPost;
    }

    public void setIdOwnerPost(int idOwnerPost) {
        this.idOwnerPost = idOwnerPost;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getClose() {
        return close;
    }

    public void setClose(int close) {
        this.close = close;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }

    public int getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(int commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public int getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(int likesInfo) {
        this.likesInfo = likesInfo;
    }

    public int getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(int repostInfo) {
        this.repostInfo = repostInfo;
    }

    public int getCountViews() {
        return countViews;
    }

    public void setCountViews(int countViews) {
        this.countViews = countViews;
    }

    public int getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(int geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getInterestsInfo() {
        return interestsInfo;
    }

    public void setInterestsInfo(int interectsInfo) {
        this.interestsInfo = interectsInfo;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }
}



