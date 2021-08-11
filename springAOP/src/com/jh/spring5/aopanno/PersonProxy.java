package com.jh.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class PersonProxy {

    @Before(value = "execution(* com.jh.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("personproxy before");
    }


}
