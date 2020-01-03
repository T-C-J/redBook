package com.tcj.red_book.entity.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;


    private String name;
    private String imgUrl;
    private String imgUrlLocal;
    private String extend;


    private Date createTime;
    private Date updateTime;

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
