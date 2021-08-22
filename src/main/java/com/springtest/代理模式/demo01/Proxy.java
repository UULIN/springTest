/*
 * Proxy.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.代理模式.demo01;

/**
 * Function: 中介
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class Proxy {
    private Host host;
    public Proxy(){};
    public Proxy(final Host host) {
        this.host = host;
    }

    public void rent(){
        host.rent();
    }
    public void seeHouse(){
        System.out.println("中介带你看房");
    }
    public void hetong(){
        System.out.println("签合同");
    }
    public void fare(){
        System.out.println("收中介费");
    }

}
