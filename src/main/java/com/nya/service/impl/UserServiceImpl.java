package com.nya.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nya.domain.User;
import com.nya.mapper.UserMapper;
import com.nya.service.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
}
