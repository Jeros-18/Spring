package com.jh.spring5.service;



import com.jh.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {


    @Autowired // 等价 @Resource
    @Qualifier(value = "userDaoImpl2")  //  等价  @Resource(name = "userDaoImpl2")

    private UserDao userDao;

    public void add(){
        System.out.println("userservice add...");
        userDao.add();
    }
}
