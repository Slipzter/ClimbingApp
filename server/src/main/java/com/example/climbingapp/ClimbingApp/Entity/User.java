package com.example.climbingapp.ClimbingApp.Entity;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String userId;

    private String userFirstName;

    private String userLastName;

    private String userEmail;

    public User() {

    }

    public User(String userFirstName, String userLastName, String userEmail){
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public  void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName(){
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUserEmail(){
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

}
