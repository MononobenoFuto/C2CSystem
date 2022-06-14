package com.nya.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.nya.domain.Commodity;
import com.nya.service.ICommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commodities")
public class CommodityControl {
    @Autowired
    private ICommodityService commodityService;

    @PostMapping
    public Boolean save(@RequestBody Commodity commodity) {
        return commodityService.save(commodity);
    }

    @GetMapping("{id}")
    public Commodity getByID(@PathVariable Integer id) {
        return commodityService.getById(id);
    }
    
    @GetMapping("/page/{currentPage}/{pageSize}")
    public IPage<Commodity> getByPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        return commodityService.getByPage(currentPage, pageSize);
    }

    @GetMapping("/page/{currentPage}/{pageSize}/{ctype}")
    public IPage<Commodity> getByPageWithType(@PathVariable Integer currentPage, @PathVariable Integer pageSize, @PathVariable String ctype) {
        return commodityService.getByPageWithType(currentPage, pageSize, ctype);
    }

    @GetMapping("/keypage/{currentPage}/{pageSize}/{key}")
    public IPage<Commodity> getByPageWithKey(@PathVariable Integer currentPage, @PathVariable Integer pageSize, @PathVariable String key) {
        return commodityService.getByPageWithKey(currentPage, pageSize, key);
    }
}
