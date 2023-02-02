package com.hakanboranbay.aop.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

@Interceptor
@javax.interceptor.Interceptor
public class InterceptorMainWork {

    @AroundInvoke public Object loglama(InvocationContext context) {

        System.out.println("İlk Hali" + context.getMethod().getName());

        // kullanıcı : giriş yapmış mı?
        boolean isLogin = true; // true:önce sisteme login olmalı;  yol kesici olacak değişkenimiz
        //jdbc : session?
        Object isContinue = null; // eğer yol kesilmezse devam edeceğim.

        if (isLogin) {
            // önce sisteme giriş yapsın
            System.out.println("önce sisteme giriş yapsın !!!");
           return null;
        } else {
            try {
                isContinue = context.proceed(); // devam etmesini sağlamak
                System.out.println("Sonraki hali: " + isContinue);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }

    }

}
