package com.fei;

import org.apache.dubbo.common.json.JSON;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.PostConstruct;
import java.io.IOException;

//@SpringBootApplication(scanBasePackages = {"com.fei.db", "com.fei.common", "com.fei.wx"})
//@MapperScan("com.fei.db.dao")
//@EnableTransactionManagement
//@EnableScheduling
@EnableDubbo
@EnableDubboConfig
@MapperScan("com.fei.db.mapper")
@SpringBootApplication
public class SystemApplication {
    private static Logger logger = LoggerFactory.getLogger(SystemApplication.class);

    @Autowired
    Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
    }

    @PostConstruct
    public void init() throws IOException {
        String[] activeProfiles = environment.getActiveProfiles();
        String[] defaultProfiles = environment.getDefaultProfiles();
        System.err.println(JSON.json(activeProfiles));
        System.err.println(JSON.json(defaultProfiles));
        System.err.println(environment.getProperty("spring.datasource.druid.url"));
        System.err.println(environment.getProperty("dubbo.application.name"));
    }
}
