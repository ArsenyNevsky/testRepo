package com.epam.batis.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getAll() throws Exception {
        System.out.println(userMapper.getAllUsers());
    }

    @Test
    public void getUserById() throws Exception {
        User user = userMapper.findUserById(1);
        System.out.println("\n\n\nFOUNDED:\n" + user + "\n\n");
        user = userMapper.findUserById(2);
        System.out.println("\n\n\nNOT FOUND:\n" + user + "\n\n");
    }

    @Test
    public void saveUser() throws Exception {
        User user = User.builder()
                .birthday(new Timestamp(new Date().getTime()))
                .email("test")
                .firstname("Timur")
                .middlename("Radikovich")
                .lastname("Nasibullin")
                .password("123")
                .build();
        userMapper.createUser(user);
        System.out.println("\n\n" + userMapper.getAllUsers());
    }

    public void deleteUser() {

    }

}