/*
 * ProxyInvocationHandler.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.代理模式.demo03;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    public Object target;

    public void setTarget(final Object target) {
        this.target = target;
    }

    //生成代理对象
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    // method : 代理类的调用处理程序的方法对象.
    @Override
    public Object invoke(final Object proxy, final Method method, final Object[] args)
            throws Throwable {
        log(method.getName());
        Object result = method.invoke(target,args);
        return result;
    }
    public void log(String str){
        System.out.print("[INFO] "+str+"代理类: ");
    }
}
