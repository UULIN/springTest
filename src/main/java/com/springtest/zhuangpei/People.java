/*
 * People.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.zhuangpei;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class People {
    private String name;
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;

    public String getName() {
        return name;
    }

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", cat=" + cat.toString() +
                ", dog=" + dog.toString() +
                '}';
    }
}
