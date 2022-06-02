package com.nya.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nya.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserMapperTest {
    @Autowired      //该注解给bean注入外部资源
    private UserMapper userMapper;
    @Test
    void testGetById() {
        System.out.println(userMapper.selectById(2019112297));
    }

    @Test
    void testInsert() {
        User user = new User();
        user.setId(2019112299);
        user.setIssuper(0);
        user.setNickname("hello");
        userMapper.insert(user);
    }

    @Test
    void testDeleteId() {
        System.out.println(userMapper.deleteById(1));
    }

    @Test
    void testGetAll() {
        System.out.println(userMapper.selectList(null));
    }

    @Test
    void testGetPage() {
        IPage<User> page = new Page<User>(1, 5);
        userMapper.selectPage(page, null);
        System.out.println(page.getRecords());
    }
}