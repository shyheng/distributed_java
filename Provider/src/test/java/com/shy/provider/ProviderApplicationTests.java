package com.shy.provider;

import com.shy.provider.mapper.DayMapper;
import com.shy.provider.service.IDayService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProviderApplicationTests {

    @Autowired
    IDayService iDayService;

    @Test
    void contextLoads() {
//        System.out.println(iDayService.SelByDay("2022-2-2").get(0).getMsg1());
    }

}
