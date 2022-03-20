package com.tongzhou.seata.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.tongzhou.seata.dao"})
public class MyBatisConfig {
}

