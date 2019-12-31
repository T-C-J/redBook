package com.tcj.red_book.config;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfiguration implements WebMvcConfigurer {


//    注意拦截路径的写法：
//        /**/*.html 表示所有的html文件。
//            /img/**    表示img目录下的所有文件。

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String paths = LoginInfoProperties.getValue("loginReleasePaths");
        String[] loginReleasePaths;
        if(StringUtils.isNotBlank(paths)){
            System.out.println(paths);
//            loginReleasePaths = new String[]{"/img/**","/**/*.html","/user/login/pc"};
            loginReleasePaths = new String[]{"/","/index","/loginPage","/register","/toLogin","/errorPage"
            ,"/img/**","/css/**","/js/**"};
        }else{
            loginReleasePaths = new String[0];
        }

        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")//拦截路径
                .excludePathPatterns(loginReleasePaths);//不进行拦截路径
    }

}