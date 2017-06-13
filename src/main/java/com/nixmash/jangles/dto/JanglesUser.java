package com.nixmash.jangles.dto;

import java.sql.Timestamp;

public class JanglesUser {

    public JanglesUser() {
    }

    public JanglesUser(String userName, String password, String displayName) {
        this.userName = userName;
        this.password = password;
        this.displayName = displayName;
    }

    // region properties

    private int userId;
    private String userName;
    private String password;
    private String displayName;
    private Timestamp dateCreated;
    private Boolean isActive = true;

// endregion

    // region getters/setters

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }


// endregion

    @Override
    public String toString() {
        return "JanglesUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", displayName='" + displayName + '\'' +
                ", dateCreated=" + dateCreated +
                ", isActive=" + isActive +
                '}';
    }
}


	
