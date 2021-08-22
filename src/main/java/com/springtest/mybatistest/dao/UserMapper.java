/*
 * userMapper.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package com.springtest.mybatistest.dao;

import com.springtest.mybatistest.pojo.User;

import java.util.List;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/23
 */
public interface UserMapper {
    public List<User> selectUser();
}
