package com.tcj.red_book.entity.base;

import lombok.Data;

@Data
public class LoginResp {
    private String token;


    public LoginResp() {
    }

    public LoginResp(String token) {
        this.token = token;
    }
}
