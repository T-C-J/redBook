package com.tcj.red_book.entity.pojo;

public class RecordWithBLOBs extends Record {
    private String article;

    private String extend;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article == null ? null : article.trim();
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend == null ? null : extend.trim();
    }
}