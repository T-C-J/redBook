package com.tcj.red_book.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * 载荷
 * 一般包含：用户身份信息  tokenID 注册声明
 * @param <T>
 */

@Data
public class Payload<T> {
    private String id;//jwtid 唯一标识 在这里是tokenID
    private T info;//用户信息
    private Date expiration;//过期时间
}