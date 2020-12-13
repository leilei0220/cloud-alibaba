package com.leilei.demo;

/**
 * @author lei
 * @version 1.0
 * @date 2020/12/13 22:17
 * @desc
 */
public class User {
    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public User() {
    }

    public User(String userName, String passWord) {

        this.userName = userName;
        this.passWord = passWord;
    }
}
