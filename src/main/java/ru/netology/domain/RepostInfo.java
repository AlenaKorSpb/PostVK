package ru.netology.domain;

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

