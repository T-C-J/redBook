package com.tcj.red_book.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Book {
    private String tiitle;
    private String tag;
    private Date createTime;
    private String data;


    public Book(String tiitle, String tag, Date createTime, String data) {
        this.tiitle = tiitle;
        this.tag = tag;
        this.createTime = createTime;
        this.data = data;
    }

    public Book() {
    }
}
