package com.bupt.zhushi.jbdc.entity;

public class Book {
    private int userId;
    private String userName;
    private String userStatus;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userStatus='" + userStatus + '\'' +
                '}';
    }
}
