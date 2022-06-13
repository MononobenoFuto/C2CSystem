package com.nya.controller;

import com.nya.domain.Cart;
import com.nya.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private ICartService cartService;

    @PostMapping
    public Boolean addGoods(@RequestBody Cart cart) {
        return  cartService.save(cart);
    }
}
