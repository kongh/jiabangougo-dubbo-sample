package com.jiabangougo.dubbo.user;

import java.io.Serializable;

/**
 *
 */
public class UserResultDTO implements Serializable{

    private Integer code;

    private String message;

    private UserDO user;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserDO getUser() {
        return user;
    }

    public void setUser(UserDO user) {
        this.user = user;
    }
}
