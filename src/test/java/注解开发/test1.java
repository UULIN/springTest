/*
 * test1.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package 注解开发;

import com.springtest.注解开发.config.myConfig;
import com.springtest.注解开发.dao.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class test1 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(myConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
