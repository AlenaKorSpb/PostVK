package ru.netology.domain;

public class LikesInfo {

    private int count;
    private boolean isUserLikes;
    private boolean isCanLike;

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

    public boolean isCanLike() {
        return isCanLike;
    }

    public void setCanLike(boolean canLike) {
        isCanLike = canLike;
    }


}


