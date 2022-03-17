package com.shy.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shy.model.User;
import com.shy.service.IUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author shyheng
 * @since 2022-03-15
 */
@RestController
public class UserController {
    @DubboReference(interfaceClass = IUserService.class, version = "1.0.0", check = true, timeout = 15000)
    private IUserService iUserService;

    @GetMapping("/test")
    public List<User> test(){
        return iUserService.list();
    }


}
