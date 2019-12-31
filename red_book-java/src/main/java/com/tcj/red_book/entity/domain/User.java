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
    private int phone;
    private int matchId;

    private String imgUrl;
    private String imgUrlLocal;
    private String extend;

    private Date birthday;
    private Date createTime;
    private Date updateTime;

    private Integer isActive;


    private User(String username, String password) {
        this.username = username;
        this.password = password;
        this.createTime = new Date();
    }

    public static User register(String username, String password){
        return new User(username,password);
    }
}
