package com.hakanboranbay.aop.interceptor;

@Interceptor
public class Login {

    public String isLoginMethod(String data) {
        return "isLogin: " + data;
    }

}
