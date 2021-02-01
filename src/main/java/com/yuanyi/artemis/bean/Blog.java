package com.yuanyi.artemis.bean;

import java.util.Date;

/**
 * @name: 博客实体类
 * @author: yuanyi
 * @time：2021/01/29 10:23
 * @version：ver 1.0
 */
public class Blog {

    private Integer id;

    private String title;

    private String titlearray;

    private String introduction;

    private Date time;

    private String content;

    private User user;

    public Blog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitlearray() {
        return titlearray;
    }

    public void setTitlearray(String titlearray) {
        this.titlearray = titlearray;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
