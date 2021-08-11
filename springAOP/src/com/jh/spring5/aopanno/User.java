package com.jh.spring5.aopanno;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void add(){
        System.out.println("user add....");
    }

}
