package com.jh.spring5.test;

import com.jh.spring5.config.SpringConfig;
import com.jh.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {


    // 配置文件
    @Test
    public void testService1() {
        //加载配置类
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService",
                UserService.class);
        System.out.println(userService);
        userService.add();
    }

//    配置类
    @Test
    public void testService2() {
        //加载配置类
        ApplicationContext context
                = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService",
                UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
