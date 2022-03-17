package com.shy.provider;


import lombok.extern.log4j.Log4j2;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.shy.provider.mapper")
@Log4j2
@EnableDubbo(scanBasePackages = {"com.shy.provider.serviceImpl"})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }

}
