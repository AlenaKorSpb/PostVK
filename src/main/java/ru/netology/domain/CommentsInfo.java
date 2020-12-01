package ru.netology.domain;

public class CommentsInfo {

    private int count;
    private boolean isGroupsCanPost;
    private boolean isCanPost;
    private boolean isCanClose;
    private boolean isCanOpen;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isGroupsCanPost() {
        return isGroupsCanPost;
    }

    public void setGroupsCanPost(boolean groupsCanPost) {
        isGroupsCanPost = groupsCanPost;
    }

    public boolean isCanPost() {
        return isCanPost;
    }

    public void setCanPost(boolean canPost) {
        isCanPost = canPost;
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
}
