package com.nya.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nya.domain.Commodity;

import java.util.List;

public interface ICommodityService extends IService<Commodity> {
    IPage<Commodity> getByPage(Integer currentPage, Integer pageSize);
    IPage<Commodity> getByPageWithType(Integer currentPage, Integer pageSize, String type);

    IPage<Commodity> getByPageWithKey(Integer currentPage, Integer pageSize, String key);
}
