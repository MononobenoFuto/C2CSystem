package com.nya.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommodityServiceTest {
    @Autowired
    private ICommodityService commodityService;

    @Test
    void testGetPage() {
        System.out.println(commodityService.getByPageWithKey(1, 8, "有"));
    }
}
