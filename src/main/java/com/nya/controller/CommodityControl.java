package com.nya.controller;

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
}
