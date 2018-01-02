package com.service;

import entity.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import service.UserService;

import com.baseTest.SpringTestCase;


public class UserServiceTest extends SpringTestCase {
    @Autowired
    private UserService userService;
    Logger logger = Logger.getLogger(UserServiceTest.class);

    @Test
    public void selectUserByIdTest(){
        User user = userService.selectUserById(10);
        logger.debug("查找结果" + user);
    }


}