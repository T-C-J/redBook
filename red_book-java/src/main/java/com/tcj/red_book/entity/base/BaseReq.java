package com.tcj.red_book.entity.base;

import lombok.Data;

@Data
public class BaseReq {
    private String method;
    private String timestamp;
    private String v;
    private String body;
}
