/*
 * test.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package aop;

import com.springtest.aop.demo01.userService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aopbeans.xml");
        userService userService = (userService) context.getBean("userService");

        userService.add();
    }
}
