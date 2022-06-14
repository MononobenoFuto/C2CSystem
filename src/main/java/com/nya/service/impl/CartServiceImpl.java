package com.nya.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nya.domain.Cart;
import com.nya.mapper.CartMapper;
import com.nya.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
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

    @Override
    public List<Cart> getByBuyeridIncart(Integer buyerid) {
        Map<String,Object> map=new HashMap<>();
        map.put("buyerid", buyerid);
        map.put("status", "incart");
        return cartMapper.selectByMap(map);
    }

    @Override
    public List<Cart> getByBuyeridFinish(Integer buyerid) {
        Map<String,Object> map=new HashMap<>();
        map.put("buyerid", buyerid);
        map.put("status", "finish");
        return cartMapper.selectByMap(map);
    }

    @Override
    public Boolean finishTrade(Integer cid, Integer buyerid) {
        Cart cart = new Cart();
        cart.setBuyerid(buyerid);
        cart.setCid(cid);
        cart.setStatus("finish");
        UpdateWrapper<Cart> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("cid", cid).or().eq("buyerid", buyerid);
        return cartMapper.update(cart, updateWrapper) > 0;
    }
}
