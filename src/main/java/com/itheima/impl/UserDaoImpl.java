package com.itheima.impl;

import com.itheima.UserDao;

public class UserDaoImpl implements UserDao {

    @Override
    public void save() {
        System.out.println("user dao save...");
    }
}
