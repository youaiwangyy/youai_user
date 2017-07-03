package com.wangyy.youai.po;

import java.io.Serializable;

/**
 * Created by qingjiang on 2017/6/14.
 */
public class User extends Person implements Serializable {

    private static final long serialVersionUID = 4945019694040425153L;
    private long uid;
    private String password;
    private String ext;

    public User() {
    }

    public User(long uid, String username, String password) {
        this.uid = uid;
        this.username = username;
        this.password = password;
    }

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("uid=").append(uid);
        sb.append(", password='").append(password).append('\'');
        sb.append(", ext='").append(ext).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
