package com.shy.provider;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CodeNew {
    public static void main(String[] args) {
        Map<OutputFile, String> pathInfo = new HashMap<>();
        pathInfo.put(OutputFile.mapper, "E:\\Distributed\\Provider\\src\\main\\java\\com\\shy\\provider\\mapper");
        pathInfo.put(OutputFile.entity, "E:" +
                "\\Distributed\\Interface\\src\\main\\java\\com\\shy\\model");
        pathInfo.put(OutputFile.service, "E:\\Distributed\\Interface\\src\\main\\java\\com\\shy\\service");
        pathInfo.put(OutputFile.serviceImpl, "E:\\Distributed\\Provider\\src\\main\\java\\com\\shy\\provider\\serviceImpl");
        pathInfo.put(OutputFile.controller, "E:\\Distributed\\Consumer\\src\\main\\java\\com\\shy\\consumer\\controller");
        pathInfo.put(OutputFile.xml, "E:\\Distributed\\Provider\\src\\main\\java\\com\\shy\\provider\\mapper");

        FastAutoGenerator.create("jdbc:mysql://120.77.255.179:3306/log4j?serverTimezone=GMT%2B8&useSSL=true",
                "root",
                "1234")
                .globalConfig(builder -> {
                    builder.author("shyheng") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\Distributed\\Provider\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.shy.provider") // 设置父包名
//                            .moduleName("system") // 设置父包模块名
                            .pathInfo(pathInfo);
                })
                .strategyConfig(builder -> {
                    builder.addInclude("user"); // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
