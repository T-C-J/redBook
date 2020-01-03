package com.tcj.red_book.entity.pojo;

import java.util.Date;

public class Category {
    private Integer id;

    private Integer userId;

    private String name;

    private String imgUrl;

    private String imgUrlLocal;

    private Date createTime;

    private Date updateTime;

    private String extend;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getImgUrlLocal() {
        return imgUrlLocal;
    }

    public void setImgUrlLocal(String imgUrlLocal) {
        this.imgUrlLocal = imgUrlLocal == null ? null : imgUrlLocal.trim();
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

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }


    public Category() {
    }

    public Category(Integer userId) {
        this.userId = userId;
        this.createTime = new Date();
    }

    public static Category defaultCategory(Integer userId){
        Category category = new Category(userId);
        category.setName("默认分类");
        return category;
    }
}