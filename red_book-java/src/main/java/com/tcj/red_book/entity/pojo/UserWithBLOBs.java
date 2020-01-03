package com.tcj.red_book.entity.pojo;

public class UserWithBLOBs extends User {
    private String imgUrl;

    private String extend;

    private String imgUrlLocal;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }

    public String getImgUrlLocal() {
        return imgUrlLocal;
    }

    public void setImgUrlLocal(String imgUrlLocal) {
        this.imgUrlLocal = imgUrlLocal == null ? null : imgUrlLocal.trim();
    }
}