package com.wangyy.youai.po;

import java.io.Serializable;

/**
 * Created by qingjiang on 2017/6/21.
 */
public class Person implements Serializable{


    private static final long serialVersionUID = -4296580673565920021L;
    public String username;
    public int age;
    public byte sex;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }
}
