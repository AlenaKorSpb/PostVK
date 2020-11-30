package ru.netology.domain;

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


