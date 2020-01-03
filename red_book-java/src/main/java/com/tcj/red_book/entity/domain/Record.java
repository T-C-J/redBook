package com.tcj.red_book.entity.domain;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
public class Record {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;

    private Integer category;


    private String article;
    private String extend;
    private String tag;
    private String title;


    private Date createTime;
    private Date updateTime;

    public Record() {
    }

    public Record(Integer userId) {
        this.userId = userId;
        this.createTime = new Date();
    }

    public static Record defaultRecord(Integer userId,Integer category){
        Record record = new Record(userId);
        record.setCategory(category);
        record.setArticle("请输入内容");
        record.setTitle("第一篇文章");
        return record;
    }
}
