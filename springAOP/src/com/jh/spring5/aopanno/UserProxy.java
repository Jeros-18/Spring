package com.jh.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class UserProxy {

    @Pointcut(value = "execution(* com.jh.spring5.aopanno.User.add(..))")
    public void pointdemo(){

    }


    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("userproxy before....");
    }



}
