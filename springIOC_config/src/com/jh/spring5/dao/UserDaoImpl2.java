package com.jh.spring5.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl2 implements UserDao {
    @Override
    public void add() {
        System.out.println("userDaoImpl2 add()");
    }
}
