package com.tcj.red_book.service;

import com.tcj.red_book.entity.base.BaseResp;
import com.tcj.red_book.entity.base.LoginBody;
import com.tcj.red_book.entity.base.RegisterBody;

import javax.servlet.http.HttpServletRequest;

public interface AuthService {

    BaseResp toLogin(LoginBody loginBody);

    BaseResp toRegister(RegisterBody registerBody);

}
