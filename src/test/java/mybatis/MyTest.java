/*
 * MyTest.java
 * Copyright 2021 Qunhe Tech, all rights reserved.
 * Qunhe PROPRIETARY/CONFIDENTIAL, any form of usage is subject to approval.
 */

package mybatis;


import com.springtest.mybatistest.dao.UserMapper;
import com.springtest.mybatistest.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Function: 
 *
 * @author 云铮
 * @date 2021/8/23
 */
public class MyTest {
    public static void main(String[] args) throws IOException {
        String resources = "mybatis-config.xml";
        InputStream in = Resources.getResourceAsStream(resources);
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = sessionFactory.openSession();
        UserMapper userMapper = session.getMapper(UserMapper.class);
        List<User>  userList = userMapper.selectUser();
        for (User user1: userList) {
            System.out.println(user1);
        }
        session.close();


    }
}
