package com.tcj.red_book.service;

import com.tcj.red_book.entity.base.BaseResp;
import com.tcj.red_book.entity.base.LoginBody;
import com.tcj.red_book.entity.base.RegisterBody;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AuthTest {

    @Autowired
    private AuthServie authServie;

    @Test
    public void login(){
        LoginBody loginBody = new LoginBody();
        loginBody.setUserName("tcj");
        loginBody.setPassWord("159357");
        BaseResp baseResp = authServie.toLogin(loginBody);

        System.out.println(baseResp);
    }

    @Test
    public void register(){

        RegisterBody registerBody = new RegisterBody();
        registerBody.setPassword("159357");
        registerBody.setUserName("tcj");
        BaseResp baseResp = authServie.toRegister(registerBody);
        System.out.println(baseResp);
    }
}
