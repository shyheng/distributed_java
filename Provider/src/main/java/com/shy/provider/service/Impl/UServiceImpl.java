package com.shy.provider.service.Impl;

import com.shy.provider.service.UService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = UService.class,timeout = 15000)
public class UServiceImpl implements UService {

    @Override
    public String STRING(int id) {
        return ""+id;
    }
}
