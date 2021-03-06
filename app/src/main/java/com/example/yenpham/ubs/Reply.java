package com.example.yenpham.ubs;
/**
 * Created by ThaoNguyen on 11/14/16.
 */

public class Reply {
    private int repID;
    private int disID;
    private int userID;
    private int clubID;
    private String dateTime;
    private String content;

    public Reply() {
    }

    public Reply(int repID, int disID, int userID, int clubID, String dateTime, String content) {
        this.repID = repID;
        this.disID = disID;
        this.userID = userID;
        this.clubID = clubID;
        this.dateTime = dateTime;
        this.content = content;
    }

    public int getRepID() {
        return repID;
    }

    public void setRepID(int repID) {
        this.repID = repID;
    }

    public int getDisID() {
        return disID;
    }

    public void setDisID(int disID) {
        this.disID = disID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Reply{" +
                "repID=" + repID +
                ", disID=" + disID +
                ", userID=" + userID +
                ", clubID=" + clubID +
                ", dateTime='" + dateTime + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
