/*
 * User.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.注解开发.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
@Component
public class User {
    @Value("云铮")
    public  String name ;

    public String getName() {
        return name;
    }


}
