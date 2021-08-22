/*
 * myConfig.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.注解开发.config;

import com.springtest.注解开发.dao.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/22
 */
@Configuration
public class myConfig {
    @Bean
    public User getUser(){
        return new User();
    }
}
