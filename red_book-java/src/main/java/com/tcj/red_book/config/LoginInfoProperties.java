package com.tcj.red_book.config;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class LoginInfoProperties {
    private static final String LOGIN = "login";
    private static ResourceBundle LOGIN_BUNDLE = ResourceBundle.getBundle(LOGIN);

    public static String getValue(String key){
        try {
            return LOGIN_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            e.printStackTrace();
        }
        return "";
    }
}