package com.itheima.service.impl;

import com.itheima.UserDao;
import com.itheima.service.UserService;

public class UserServiceImpl implements UserService {
    //删除业务层中使用new的方式创建的Dao对象
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println("user service save...");
        userDao.save();
    }
    //提供对应的set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
