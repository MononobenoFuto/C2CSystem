package com.nya.service;

import com.nya.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private IUserService userService;

    @Test
    void testGetById() {
        System.out.println(userService.getById(2019112297));
    }

    @Test
    void testInsert() {
        User user = new User();
        user.setNickname("testnick");
        user.setIssuper(0);
        user.setPassword("testpwd");
        user.setPhone("13777777777");
        user.setSex("m");
        user.setId(2019112222);
        userService.save(user);
    }
}
