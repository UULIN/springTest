/*
 * User.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.mybatistest.pojo;

import lombok.Data;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/23
 */
@Data
public class User {
    private int id;
    private String name;
    private String pwd;
}
