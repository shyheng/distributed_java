package com.shy.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.provider.model.User;


public interface UserService extends IService<User> {
    User Test(int id);
}
