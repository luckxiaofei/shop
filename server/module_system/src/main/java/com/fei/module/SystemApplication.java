package com.fei.module;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

//@SpringBootApplication(scanBasePackages = {"com.fei.db", "com.fei.common", "com.fei.wx"})
//@MapperScan("com.fei.db.dao")
//@EnableTransactionManagement
//@EnableScheduling
@EnableDubbo
@EnableDubboConfig
@MapperScan("com.fei.db.mapper")
@SpringBootApplication
public class SystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }

}
