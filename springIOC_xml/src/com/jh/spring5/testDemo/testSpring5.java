package com.jh.spring5.testDemo;

import com.jh.spring5.Book;
import com.jh.spring5.Orders;
import com.jh.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class testSpring5 {

    @Test
    public void testAdd(){
        ApplicationContext context= new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user",User.class);
        System.out.println(user);
        user.add();
    }

    // set注入属性
    @Test
    public void testBook(){
        ApplicationContext context= new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book1", Book.class);
        System.out.println(book);
        book.test();
    }

    // 有参构造注入属性
    @Test
    public void testOrders(){
        ApplicationContext context= new ClassPathXmlApplicationContext("bean1.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.test();
    }

    // p名称空间注入


}
