package com.jh.spring5.test;

import com.jh.spring5.aopanno.User;
import com.jh.spring5.config.ConfingAop;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.aspectj.SpringConfiguredConfiguration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

public class TestAop {
    @Test
    public void testAopAnno() {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopAnno2() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfingAop.class);
        User user = context.getBean("user", User.class);
        user.add();
    }


}
