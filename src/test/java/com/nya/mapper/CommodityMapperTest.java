package com.nya.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.nya.domain.Commodity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CommodityMapperTest {
    @Autowired
    private CommodityMapper commodityMapper;

    @Test
    void testGetPage() {
        IPage page = new Page(1, 8);
        commodityMapper.selectPage(page, null);
    }

    @Test
    void testGetConditionedPage() {
        IPage page = new Page(1, 8);
        QueryWrapper<Commodity> qw = new QueryWrapper<>();
        qw.like("id", "1000000");
        commodityMapper.selectPage(page, qw);
    }
}
