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

    public class CommentsInfo {
        private int count;
        private boolean isCannotComment;
        private boolean isCanComment;
        private boolean isCanClose;
        private boolean isCanOpen;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public boolean isCannotComment() {
            return isCannotComment;
        }

        public void setCannotComment(boolean cannotComment) {
            isCannotComment = cannotComment;
        }

        public boolean isCanComment() {
            return isCanComment;
        }

        public void setCanComment(boolean canComment) {
            isCanComment = canComment;
        }

        public boolean isCanClose() {
            return isCanClose;
        }

        public void setCanClose(boolean canClose) {
            isCanClose = canClose;
        }

        public boolean isCanOpen() {
            return isCanOpen;
        }

        public void setCanOpen(boolean canOpen) {
            isCanOpen = canOpen;
        }

        public class LikesInfo {
            private int count;
            private boolean isUserLikes;
            private boolean isNotUserLikes;
            private boolean isCanLike;
            private boolean isNotCanLike;


            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public boolean isUserLikes() {
                return isUserLikes;
            }

            public void setUserLikes(boolean userLikes) {
                isUserLikes = userLikes;
            }

            public boolean isNotUserLikes() {
                return isNotUserLikes;
            }

            public void setNotUserLikes(boolean notUserLikes) {
                isNotUserLikes = notUserLikes;
            }

            public boolean isCanLike() {
                return isCanLike;
            }

            public void setCanLike(boolean canLike) {
                isCanLike = canLike;
            }

            public boolean isNotCanLike() {
                return isNotCanLike;
            }

            public void setNotCanLike(boolean notCanLike) {
                isNotCanLike = notCanLike;
            }
        }


        public class RepostInfo {
            private boolean isCanRepost;
            private int count;
            private boolean isUserReposted;


            public boolean isCanRepost() {
                return isCanRepost;
            }

            public void setCanRepost(boolean canRepost) {
                isCanRepost = canRepost;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }

            public boolean isUserReposted() {
                return isUserReposted;
            }

            public void setUserReposted(boolean userReposted) {
                isUserReposted = userReposted;
            }
        }


        public class CountViews {
            private int count;
        }


        public class GeoInfo {
            private String type;
            private String coordinates;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getCoordinates() {
                return coordinates;
            }

            public void setCoordinates(String coordinates) {
                this.coordinates = coordinates;
            }

        }

        public class InterestsInfo {
            private boolean IsNotInterested; //не интересно
            private boolean IsSaveToBookmarks; //сохранить в закладках
            private boolean IsComplain; //пожаловаться
            private boolean IsNotifyAboutEntries; //уведомлять о записях

            public boolean isNotInterested() {
                return IsNotInterested;
            }

            public void setNotInterested(boolean notInterested) {
                IsNotInterested = notInterested;
            }

            public boolean isSaveToBookmarks() {
                return IsSaveToBookmarks;
            }

            public void setSaveToBookmarks(boolean saveToBookmarks) {
                IsSaveToBookmarks = saveToBookmarks;
            }

            public boolean isComplain() {
                return IsComplain;
            }

            public void setComplain(boolean complain) {
                IsComplain = complain;
            }

            public boolean isNotifyAboutEntries() {
                return IsNotifyAboutEntries;
            }

            public void setNotifyAboutEntries(boolean notifyAboutEntries) {
                IsNotifyAboutEntries = notifyAboutEntries;
            }
        }
    }
}


