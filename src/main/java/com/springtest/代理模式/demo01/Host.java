/*
 * Host.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.代理模式.demo01;

/**
 * Function: 房东
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东要出租房子");
    }
}
