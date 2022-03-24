package com.shy.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shy.provider.model.Day;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author shyheng
 * @since 2022-03-23
 */
public interface IDayService extends IService<Day> {

    boolean InsADD(Day day);
    Day SelByDay(String day);
}
