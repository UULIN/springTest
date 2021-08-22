/*
 * test.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

import com.springtest.Student;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/21
 */
public class test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student.toString());
    }
}
