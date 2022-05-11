package com.example.xdclass;

import com.example.xdclass.controller.UserController;
import com.example.xdclass.domain.User;
import com.example.xdclass.utils.JsonData;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = XdclassApplication.class)
public class UserTest {

    @Autowired
    private UserController userController;

    @Test
    public void loginTest(){

        User user  = new User();
        user.setUsername("aaa");
        user.setPwd("123");

        JsonData jsonData = userController.login(user);

        System.out.println(jsonData.toString());

        TestCase.assertEquals(0,jsonData.getCode());

    }

}
