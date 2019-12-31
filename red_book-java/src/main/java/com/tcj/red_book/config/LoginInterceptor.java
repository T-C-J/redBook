package com.tcj.red_book.config;

import com.tcj.red_book.entity.base.Payload;
import com.tcj.red_book.entity.base.UserInfo;
import com.tcj.red_book.util.JwtUtils;
import com.tcj.red_book.util.RequestHeaderUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private JwtProperties jwtProperties;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("requestURI:" + request.getRequestURI());
        BeanFactory factory = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getServletContext());
        jwtProperties = (JwtProperties) factory.getBean("jwtProperties");
        //token校验 cookie里面REMOKE_TOKEN
        String token = RequestHeaderUtil.getHeaderValue(request, jwtProperties.getUser().getCookieName());
        //获取token中用户信息
        if(token==null){
            return false;
        }
        Payload<UserInfo> payload = JwtUtils.getInfoFromToken(token, jwtProperties.getPublicKey(), UserInfo.class);
        //payload为空 或者出现了jwt过期异常就自动重定向到登录页面
        if(payload==null){
            return false;
        }
        UserInfo user = payload.getInfo();
        if(user==null){
            return false;
        }
        return true;
    }
}