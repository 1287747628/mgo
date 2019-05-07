package com.custom.mgo.vo;

import com.custom.mgo.constants.Constants;

import java.util.Map;

public class UrlStatusVO {

    private String url;
    private Integer status;
    private String createTime;
    private String updateTime;
    private String successTime;
    private String reportTime;//csp上报资源状态的时间
    private Integer retry;//重试次数
    private String desc;//描述

    public UrlStatusVO() {

    }

    public static UrlStatusVO gainRefreshTaskQuery(String url, Integer status) {
        UrlStatusVO urlStatus = new UrlStatusVO();
        urlStatus.setUrl(url);
        urlStatus.setStatus(status);
        return urlStatus;
    }

    public static UrlStatusVO gainInitUrlStatusVO(String createTime) {
        UrlStatusVO urlStatus = new UrlStatusVO();
        urlStatus.setStatus(Constants.STATUS_INIT);
        urlStatus.setCreateTime(createTime);
        urlStatus.setUpdateTime(createTime);
        urlStatus.setRetry(0);
        return urlStatus;
    }

    /**
     * 资源发送次数增加
     */
    public static void retryIncrease(Map<String, UrlStatusVO> disContentStatusMap) {
        for (Map.Entry<String, UrlStatusVO> entry : disContentStatusMap.entrySet()) {
            UrlStatusVO vo = entry.getValue();
            vo.setRetry(vo.getRetry() + 1);
        }
    }

    /**
     * 将资源状态至为 处理中
     */
    public static void changeDealing(Map<String, UrlStatusVO> disContentStatusMap) {
        for (Map.Entry<String, UrlStatusVO> entry : disContentStatusMap.entrySet()) {
            UrlStatusVO vo = entry.getValue();
            vo.setStatus(Constants.STATUS_DEAL);
        }
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(String successTime) {
        this.successTime = successTime;
    }

    public String getReportTime() {
        return reportTime;
    }

    public void setReportTime(String reportTime) {
        this.reportTime = reportTime;
    }

    public Integer getRetry() {
        return retry;
    }

    public void setRetry(Integer retry) {
        this.retry = retry;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
