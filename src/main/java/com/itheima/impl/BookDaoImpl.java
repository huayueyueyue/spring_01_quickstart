package com.itheima.impl;

import com.itheima.BookDao;

public class BookDaoImpl implements BookDao {
    private int connectionNum;
    private String databaseName;

//    //构造器注入
//    public BookDaoImpl(int connectionNum, String databaseName) {
//        this.connectionNum = connectionNum;
//        this.databaseName = databaseName;
//    }
//    set方法注入
    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }
//
//    public void setDatabaseName(String databaseName) {
//        this.databaseName = databaseName;
//    }

    @Override
    public void save() {
        System.out.println("book dao save..."+databaseName+","+connectionNum);
    }
}
