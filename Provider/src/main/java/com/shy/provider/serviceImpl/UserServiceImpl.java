package com.shy.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shy.model.User;
import com.shy.provider.mapper.UserMapper;
import com.shy.service.IUserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shyheng
 * @since 2022-03-15
 */
@DubboService(interfaceClass = IUserService.class,version = "1.0.0",timeout = 15000)
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public String test(String test) {
        return test;
    }
}
