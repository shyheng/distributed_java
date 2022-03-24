package com.shy.provider.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.shy.provider.mapper.DayMapper;
import com.shy.provider.model.Day;
import com.shy.provider.service.IDayService;
import com.shy.provider.service.UService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shyheng
 * @since 2022-03-23
 */
@DubboService(interfaceClass = IDayService.class,timeout = 15000)
public class DayServiceImpl extends ServiceImpl<DayMapper, Day> implements IDayService {

    @Override
    public Day SelByDay(String day) {
        Map<String, Object> columnMap = new HashMap<>();
        columnMap.put("day",day);
        return listByMap(columnMap).get(0);
    }

    @Override
    public boolean InsADD(Day day) {
        return saveOrUpdate(day);
    }

}
