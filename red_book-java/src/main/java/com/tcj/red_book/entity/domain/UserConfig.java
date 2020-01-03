package com.tcj.red_book.entity.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Table(name = "user_config")
@Entity
public class UserConfig {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;

    private Integer userId;


    private String detail;
    private String headSculpture;
    private String headSculptureLocal;
    private String imgUrls;
    private String imgUrlsLocal;
    private String extend;


    private Date createTime;
    private Date updateTime;

    public UserConfig() {
    }

    public UserConfig(Integer userId) {
        this.userId = userId;
        this.createTime = new Date();
    }

    public static UserConfig defaultUserConfig(Integer userId){
        UserConfig userConfig = new UserConfig(userId);
        userConfig.setDetail("这个人很懒，暂无内容");
        return userConfig;
    }
}
