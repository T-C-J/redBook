package com.tcj.red_book.controller;

import com.tcj.red_book.entity.base.BaseReq;
import com.tcj.red_book.entity.base.BaseResp;
import com.tcj.red_book.entity.base.LoginBody;
import com.tcj.red_book.entity.base.RegisterBody;
import com.tcj.red_book.service.AuthServie;
import com.tcj.red_book.util.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
public class LoginController {

    @Autowired
    private AuthServie authServie;

    @RequestMapping("login")
    public BaseResp login(@RequestBody BaseReq req){
        log.info(JSONUtil.toJson(req));
        try{
            LoginBody loginBody = JSONUtil.toBean(req.getBody(), LoginBody.class);
            return authServie.toLogin(loginBody);
        }catch (Exception e){
            return BaseResp.errorResp("400","system error");
        }

    }

    @RequestMapping("register")
    public BaseResp register(@RequestBody BaseReq req){
        log.info(JSONUtil.toJson(req));
        try{
            RegisterBody registerBody = JSONUtil.toBean(req.getBody(), RegisterBody.class);
            return authServie.toRegister(registerBody);
        }catch (Exception e){
            return BaseResp.errorResp("400","system error");
        }
    }
}
