/*
 * Hello.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/21
 */
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(final String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "str='" + str + '\'' +
                '}';
    }
}
