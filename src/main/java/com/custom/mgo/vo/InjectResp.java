package com.custom.mgo.vo;

import java.util.List;

public class InjectResp {

    private Integer resultCode;
    private String description;
    //
    private String taskid;//任务id
    //
    private Integer total;
    private List<TaskVO> tasks;

    public InjectResp(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public InjectResp(Integer resultCode, String description) {
        this.resultCode = resultCode;
        this.description = description;
    }

    public Integer getResultCode() {
        return resultCode;
    }

    public void setResultCode(Integer resultCode) {
        this.resultCode = resultCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTaskid() {
        return taskid;
    }

    public void setTaskid(String taskid) {
        this.taskid = taskid;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<TaskVO> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskVO> tasks) {
        this.tasks = tasks;
    }
}
