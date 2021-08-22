/*
 * Test1.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

import com.springtest.zhuangpei.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("beans1.xml");
        People people = (People) context.getBean("people");
        people.getCat().shout();
        people.getDog().shout();
    }
}
