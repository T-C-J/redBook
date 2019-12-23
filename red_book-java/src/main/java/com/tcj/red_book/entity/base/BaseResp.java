package com.tcj.red_book.entity.base;

import lombok.Data;

@Data
public class BaseResp {

    private String result;
    private String message;
    private String timestamp;
    private String v;
    private String body;


    public BaseResp(String result, String message, String timestamp, String v, String body) {
        this.result = result;
        this.message = message;
        this.timestamp = timestamp;
        this.v = v;
        this.body = body;
    }

    public BaseResp() {
    }

    public BaseResp(String result, String message) {
        this.result = result;
        this.message = message;
    }

    public static BaseResp errorResp(String result,String message){
        return new BaseResp(result,message);
    }

    public static BaseResp succResp(){
        return new BaseResp("0","success");
    }
}
