package com.yuanyi.artemis.bean;

/**
 * @name: 用户实体类
 * @author: yuanyi
 * @time：2021/01/29 09:59
 * @version：ver 1.0
 */
public class User {

    private Integer id;

    private String username;

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
