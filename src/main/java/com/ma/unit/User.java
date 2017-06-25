package com.ma.unit;

/**
 * Created by Administrator on 2017/6/25.
 */
public class User {
    private String name;
    private String password;

    public void setName(String userName){
        this.name=userName;
    }

    public void setPassword(String userPassword){
        this.password=userPassword;
    }

    public String getName(){
        return this.name;
    }

    public String getPassword(){
        return this.password;
    }
}
