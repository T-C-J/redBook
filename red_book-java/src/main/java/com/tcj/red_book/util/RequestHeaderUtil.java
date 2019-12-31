package com.tcj.red_book.util;

import javax.servlet.http.HttpServletRequest;

public class RequestHeaderUtil {

    public String getHeaderString(HttpServletRequest request, String headerName){
        return getHeaderValue(request,headerName);
    }


    public static String getHeaderValue(HttpServletRequest request, String headerName) {
        String vaule = request.getHeader(headerName);
        return vaule;
    }

}
