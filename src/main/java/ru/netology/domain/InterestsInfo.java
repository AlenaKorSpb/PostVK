package ru.netology.domain;

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

