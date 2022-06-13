package com.nya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nya.domain.Cart;
import com.nya.mapper.CartMapper;
import com.nya.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {
    @Autowired
    private CartMapper cartMapper;
}
