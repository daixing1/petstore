package com.cb.sp.petstore.dto;

import java.io.Serializable;

/**
 * @author 戴兴
 * @description TODO
 * @date 2018/12/11 15:54
 */
public class LoginDto implements Serializable {

    private static final long serialVersionUID = 3508366243467000083L;
    private Integer userId;
    private String userName;
    private String password;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

    @Override
    public String toString() {
        return "LoginDto{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}