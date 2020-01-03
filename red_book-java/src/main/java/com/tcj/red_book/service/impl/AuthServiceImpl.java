package com.tcj.red_book.service.impl;

import com.tcj.red_book.config.JwtProperties;
import com.tcj.red_book.entity.base.BaseResp;
import com.tcj.red_book.entity.base.LoginBody;
import com.tcj.red_book.entity.base.LoginResp;
import com.tcj.red_book.entity.base.RegisterBody;
import com.tcj.red_book.entity.domain.User;
import com.tcj.red_book.repository.UserRepository;
import com.tcj.red_book.service.AuthService;
import com.tcj.red_book.service.RegisterService;
import com.tcj.red_book.util.BeanUtil;
import com.tcj.red_book.util.JSONUtil;
import com.tcj.red_book.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private JwtProperties jwtProperties;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;
    @Autowired
    private RegisterService registerService;

    @Override
    public BaseResp toLogin(LoginBody loginBody) {
        BaseResp res = null;
        User userInfo = userRepository.queryByPhone(loginBody.getPhoneNo());
        if(BeanUtil.isNull(userInfo))
            return BaseResp.errorResp("100","查无此人");

        Boolean canLogin=passwordEncoder.matches(loginBody.getPassWord(),userInfo.getPassword());

        if(canLogin){
            res = BaseResp.succResp();
            String token = JwtUtils.generateTokenExpireInMinutes(userInfo, jwtProperties.getPrivateKey(), jwtProperties.getUser().getExpire());
            res.setBody(JSONUtil.toJson(new LoginResp(token)));
            return res;
        }else{
            return BaseResp.errorResp("200","密码错误");
        }
    }

    @Override
    public BaseResp toRegister(RegisterBody registerBody) {
        BaseResp res = null;
        User user = userRepository.queryByPhone(registerBody.getPhoneNo());
        if(BeanUtil.nonNull(user)){
            return BaseResp.errorResp("400","用户名已存在");
        }
        User userInfo = User.register(registerBody.getPhoneNo(),passwordEncoder.encode(registerBody.getPassword()));
        userInfo = userRepository.save(userInfo);

        if(BeanUtil.nonNull(userInfo.getId())){
            res = BaseResp.succResp();
            String token = JwtUtils.generateTokenExpireInMinutes(userInfo, jwtProperties.getPrivateKey(), jwtProperties.getUser().getExpire());
            res.setBody(JSONUtil.toJson(new LoginResp(token)));
            registerService.register(userInfo);
            return res;
        }
        return BaseResp.errorResp("300","注册失败");
    }
}
