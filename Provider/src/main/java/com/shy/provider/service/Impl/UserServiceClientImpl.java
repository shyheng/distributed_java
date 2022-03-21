package com.shy.provider.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


import com.shy.provider.mapper.UserMapper;
import com.shy.provider.model.User;
import com.shy.provider.model.Users;
import com.shy.provider.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
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
public class UserServiceClientImpl extends ServiceImpl<UserMapper, User> implements UserService  {


    List<User> users = new ArrayList<>();

    @Override
    public List<User> list() {
        users = super.list();
        return users;
    }



    @Override
    public User Test(int id) {

        return new User(1,"shy","1234",0);
    }

    @Override
    public Users USERS() {
        return new Users(2,"kt","1",1);
    }

    @Override
    public List<User> USER_LIST() {
        list();
        return users;
    }

    @Override
    public int Us(User user) {
        return user.getId();
    }
}
