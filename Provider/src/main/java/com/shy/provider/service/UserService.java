package com.shy.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.provider.model.User;
import com.shy.provider.model.Users;

import java.util.List;


public interface UserService extends IService<User> {
    User Test(int id);
    Users USERS();
    List<User> USER_LIST();
}
