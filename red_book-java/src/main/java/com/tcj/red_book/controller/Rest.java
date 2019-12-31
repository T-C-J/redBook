package com.tcj.red_book.controller;

import com.tcj.red_book.entity.Book;
import com.tcj.red_book.entity.base.BaseReq;
import com.tcj.red_book.entity.base.BaseResp;
import com.tcj.red_book.entity.domain.User;
import com.tcj.red_book.repository.UserRepository;
import com.tcj.red_book.util.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class Rest {


    @Autowired
    private UserRepository userRepository;


    List<Book> books = new ArrayList<Book>(){{
        add(new Book("first","第一天",new Date(),"第一篇文章"));
        add(new Book("2","第2天",new Date(),"第一篇文章"));
        add(new Book("3","第3天",new Date(),"第一篇文章"));
        add(new Book("4","第4天",new Date(),"第一篇文章"));
        add(new Book("5","第5天",new Date(),"第一篇文章"));
        add(new Book("5","第5天",new Date()));
    }};


    @RequestMapping("test")
    public BaseResp getBooks(BaseReq req){
        BaseResp baseResp = BaseResp.succResp();
        baseResp.setBody(JSONUtil.toJson(books));
        return baseResp;
    }

    @RequestMapping("user")
    public User getUser(){
        Optional<User> byId = userRepository.findById(1);
        return byId.get();
    }
    @RequestMapping("list")
    public List<User> getUsers(){
        return userRepository.findAll();
    }

}
