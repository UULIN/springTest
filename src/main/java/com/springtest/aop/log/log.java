/*
 * log.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.aop.log;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class log implements MethodBeforeAdvice {

    @Override
    public void before(final Method method, final Object[] objects, final Object o)
            throws Throwable {
        System.out.println(o.getClass().getName()+"的"+method.getName()+"方法被执行了");
    }
}
