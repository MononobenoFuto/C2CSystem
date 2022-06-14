package com.nya.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nya.domain.Cart;

import java.util.List;

public interface ICartService extends IService<Cart> {
    Boolean removeGoods(Integer cid, Integer buyerid);
    List<Cart> getByBuyerid(Integer buyerid);
    List<Cart> getByBuyeridIncart(Integer buyerid);
    List<Cart> getByBuyeridFinish(Integer buyerid);

    Boolean finishTrade(Integer cid, Integer buyerid);
}
