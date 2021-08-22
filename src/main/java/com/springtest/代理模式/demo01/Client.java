/*
 * Client.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.代理模式.demo01;

/**
 * Function: 人要租房子
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class Client {
    public static void main(String[] args) {
        Host host = new Host();
        //代理，中介帮忙租房子
        Proxy proxy = new Proxy(host);

        proxy.rent();
    }
}
