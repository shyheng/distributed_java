package com.shy.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.model.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shyheng
 * @since 2022-03-15
 */
public interface IUserService extends IService<User> {
    String test(String test);
}
