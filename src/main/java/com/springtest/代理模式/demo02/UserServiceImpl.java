/*
 * UserServiceImpl.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.代理模式.demo02;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class UserServiceImpl implements UserService {

    @Override
    public void add() {
        System.out.println("增加了一个值");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个值");

    }

    @Override
    public void update() {
        System.out.println("更新了一个值");

    }

    @Override
    public void query() {
        System.out.println("查询了一个值");

    }
}
