package ru.netology.domain;

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


}
