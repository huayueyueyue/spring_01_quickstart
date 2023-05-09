package com.itheima.impl;

import com.itheima.BagDao;

import java.util.*;

public class BagDaoImpl implements BagDao {
    //数组
    private int[] array;
    //list
    private List<String> list;
    //set
    private Set<String> set;
    //map
    private Map<String, String> map;
    //properti
    private Properties properties;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public void save() {
        System.out.println("bag dao save...");
        System.out.println(Arrays.toString(array));
        System.out.println(list);
        System.out.println(set);
        System.out.println(map);
        System.out.println(properties);
    }
}
