package com.tcj.red_book.controller;

import com.tcj.red_book.entity.Book;
import com.tcj.red_book.entity.base.BaseReq;
import com.tcj.red_book.entity.base.BaseResp;
import com.tcj.red_book.util.JSONUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class Rest {

    List<Book> books = new ArrayList<Book>(){{
        add(new Book("first","第一天",new Date(),"第一篇文章"));
        add(new Book("2","第2天",new Date(),"第一篇文章"));
        add(new Book("3","第3天",new Date(),"第一篇文章"));
        add(new Book("4","第4天",new Date(),"第一篇文章"));
        add(new Book("5","第5天",new Date(),"第一篇文章"));
    }};


    @RequestMapping("test")
    public BaseResp getBooks(BaseReq req){
        BaseResp baseResp = BaseResp.succResp();
        baseResp.setBody(JSONUtil.toJson(books));
        return baseResp;
    }
}
