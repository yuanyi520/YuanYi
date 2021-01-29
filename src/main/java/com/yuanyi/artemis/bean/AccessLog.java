package com.yuanyi.artemis.bean;

import java.util.Date;

/**
 * @name: 日志实体类
 * @author: yuanyi
 * @time：2021/01/29 10:19
 * @version：ver 1.0
 */
public class AccessLog {

    private Integer id;

    private String ip;

    private Date time;

    private String browsename;

    private String os;

    public AccessLog() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getBrowsename() {
        return browsename;
    }

    public void setBrowsename(String browsename) {
        this.browsename = browsename;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
