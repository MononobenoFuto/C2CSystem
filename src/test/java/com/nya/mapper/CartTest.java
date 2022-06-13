package com.nya.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CartTest {
    @Autowired
    private CartMapper cartMapper;

    @Test
    void testDelete() {
        cartMapper.deleteByCidAndBuyerid(1000005, 10003);
    }
}
