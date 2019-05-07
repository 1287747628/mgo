package com.custom.mgo.vo;

import java.util.List;

public class TaskVO {

    private String taskid;
    private String createTime;
    private String type;
    private Integer status;
    private List<UrlStatusVO> urls;

    public TaskVO() {

    }

    public TaskVO(String taskid, String createTime, String type, Integer status) {
        this.taskid = taskid;
        this.createTime = createTime;
        this.type = type;
        this.status = status;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<UrlStatusVO> getUrls() {
        return urls;
    }

    public void setUrls(List<UrlStatusVO> urls) {
        this.urls = urls;
    }
}
