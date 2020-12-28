package priv.blog.personal.service.Impl;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import priv.blog.personal.entity.Users;
import priv.blog.personal.mapper.UserMapper;
import priv.blog.personal.service.UserService;

import javax.annotation.Resource;
import javax.sql.DataSource;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;

    @Test
    void login() {
       Users users =  userService.login("123123","123123");
       System.out.println(users.toString());
    }
}