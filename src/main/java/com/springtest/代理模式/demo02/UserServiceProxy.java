/*
 * UserServiceProxy.java
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
public class UserServiceProxy implements UserService {

    public UserServiceImpl mUserService;

    public void setUserService(final UserServiceImpl userService) {
        mUserService = userService;
    }

    @Override
    public void add() {
        log("用户操作了");
        mUserService.add();
    }

    @Override
    public void delete() {
        log("用户操作了");

        mUserService.delete();
    }

    @Override
    public void update() {
        log("用户操作了");

        mUserService.update();

    }

    @Override
    public void query() {
        log("用户操作了");

        mUserService.query();

    }
    public void log(String str){
        System.out.print("[INFO] user opreation" + str + ": ");

    }

}
