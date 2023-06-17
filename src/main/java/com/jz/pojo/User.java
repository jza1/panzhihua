package com.jz.pojo;

public class User {
    private int userid;//编号
    private String username;//用户id账号（电话号码）
    private String password;//密码
    private String name_s;//昵称
    private String typ;//昵称

    public User(){};

    public User(int userid, String username, String password, String name,String typ) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.name_s = name;
        this.typ=typ;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name_s;
    }

    public void setName(String name) {
        this.name_s = name;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getName_s() {
        return name_s;
    }

    public void setName_s(String name_s) {
        this.name_s = name_s;
    }

}

