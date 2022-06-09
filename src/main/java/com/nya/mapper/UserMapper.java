package com.nya.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nya.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

//接口类，用于用户的方法调用
//继承自BaseMapper，见https://www.bilibili.com/video/BV15b4y1a7yG?p=35

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where phone=#{phone} and password=#{password}")
    User getByPhoneAndPassword(String phone, String password);
}
