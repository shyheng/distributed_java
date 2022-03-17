package com.shy.provider.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.shy.provider.mapper.UserMapper;
import com.shy.provider.model.User;
import org.apache.dubbo.config.annotation.DubboService;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shyheng
 * @since 2022-03-15
 */
@DubboService(interfaceClass = UserService.class,timeout = 15000)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService  {


    @Override
    public User Test(int id) {
        return new User(1,"shy","1234",0);
    }
}
