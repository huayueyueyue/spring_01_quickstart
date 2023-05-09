package com.itheima.service.impl;

import com.itheima.BookDao;
import com.itheima.service.BookService;

public class BookServiceImpl implements BookService {
    //删除业务层中使用new的方式创建的Dao对象
    private BookDao bookDao;
//    private UserDao userDao;

    //构造器注入
////    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
////        this.bookDao = bookDao;
////        this.userDao = userDao;
//    }

    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
//        userDao.save();
    }


    //提供对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
//
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }


}
