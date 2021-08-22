/*
 * afterLog.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.aop.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class afterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(final Object returnValue, final Method method,
            final Object[] objects,
            final Object o1)
            throws Throwable {
        System.out.println("执行了"+o1.getClass().getName()+"的"+method.getName()+"方法,返回值是："+returnValue);

    }
}
