/*
 * AnnotationPointCut.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.aop.demo01;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.springtest.aop.demo01.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("=====方法执行前");
    }
    @After("execution(* com.springtest.aop.demo01.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("========方法执行后");
    }
}
