package com.tcj.red_book.entity.pojo;

public class UserConfigWithBLOBs extends UserConfig {
    private String imgUrls;

    private String extend;

    public String getImgUrls() {
        return imgUrls;
    }

    public void setImgUrls(String imgUrls) {
        this.imgUrls = imgUrls == null ? null : imgUrls.trim();
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }
}