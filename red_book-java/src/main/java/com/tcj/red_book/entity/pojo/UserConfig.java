package com.tcj.red_book.entity.pojo;

import java.util.Date;

public class UserConfig {
    private Integer id;

    private Integer userId;

    private String detail;

    private String headSculpture;

    private String headSculptureLocal;

    private String imgUrlsLocal;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getHeadSculpture() {
        return headSculpture;
    }

    public void setHeadSculpture(String headSculpture) {
        this.headSculpture = headSculpture == null ? null : headSculpture.trim();
    }

    public String getHeadSculptureLocal() {
        return headSculptureLocal;
    }

    public void setHeadSculptureLocal(String headSculptureLocal) {
        this.headSculptureLocal = headSculptureLocal == null ? null : headSculptureLocal.trim();
    }

    public String getImgUrlsLocal() {
        return imgUrlsLocal;
    }

    public void setImgUrlsLocal(String imgUrlsLocal) {
        this.imgUrlsLocal = imgUrlsLocal == null ? null : imgUrlsLocal.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}