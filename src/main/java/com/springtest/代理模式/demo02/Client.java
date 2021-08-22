/*
 * Client.java
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
public class Client {
    public static void main(String[] args) {
        UserServiceImpl mUserService = new UserServiceImpl();
        UserServiceProxy mUserServiceProxy = new UserServiceProxy();
        mUserServiceProxy.setUserService(mUserService);
        mUserServiceProxy.add();
    }

}
