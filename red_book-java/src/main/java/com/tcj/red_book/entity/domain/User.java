package com.tcj.red_book.entity.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "user")
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private String username;
    private String password;
    private String phone;
    private String matchId;

    private String imgUrl;
    private String imgUrlLocal;
    private String extend;

    private Date birthday;
    private Date createTime;
    private Date updateTime;

    private Integer isActive;


    private User(String password, String phone) {
        this.password = password;
        this.phone = phone;
        this.createTime = new Date();
    }


    public static User register(String phone, String password){
        return new User(password,phone);
    }
}
