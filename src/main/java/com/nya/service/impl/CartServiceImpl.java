package com.nya.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nya.domain.Cart;
import com.nya.mapper.CartMapper;
import com.nya.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CartServiceImpl extends ServiceImpl<CartMapper, Cart> implements ICartService {
    @Autowired
    private CartMapper cartMapper;

    @Override
    public Boolean removeGoods(Integer cid, Integer buyerid) {
        Map<String,Object> map=new HashMap<>();
        map.put("cid", cid);
        map.put("buyerid", buyerid);
        return cartMapper.deleteByMap(map) > 0;
    }

    @Override
    public List<Cart> getByBuyerid(Integer buyerid) {
        Map<String,Object> map=new HashMap<>();
        map.put("buyerid", buyerid);
        return cartMapper.selectByMap(map);
    }
}
