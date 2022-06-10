package com.nya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nya.domain.User;
import com.nya.mapper.UserMapper;
import com.nya.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public Integer login(String phone, String password) {
         User user = userMapper.getByPhoneAndPassword(phone, password);
         if(user == null) {
             return 0;
         } else {
             return user.getId();
         }
    }
}
