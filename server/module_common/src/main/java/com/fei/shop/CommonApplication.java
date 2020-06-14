package com.fei.shop;

import com.fei.service.SysAdminUserService;
import org.apache.dubbo.common.json.JSON;
import org.apache.dubbo.common.logger.Logger;
import org.apache.dubbo.common.logger.LoggerFactory;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.PostConstruct;
import java.io.IOException;

//@SpringBootApplication(scanBasePackages = {"com.fei.shop", "com.fei.common", "com.fei.wx"})
//@MapperScan("com.fei.shop.dao")
//@EnableTransactionManagement
//@EnableScheduling
@EnableDubbo
@MapperScan("com.fei.shop.mapper")
@SpringBootApplication
public class CommonApplication {
    private static Logger logger = LoggerFactory.getLogger(CommonApplication.class);

    @Autowired
    Environment environment;
    @Reference
    private SysAdminUserService sysAdminUserService;

    public static void main(String[] args) {
        SpringApplication.run(CommonApplication.class, args);
    }

    @PostConstruct
    public void init() throws IOException {
        String[] activeProfiles = environment.getActiveProfiles();
        String[] defaultProfiles = environment.getDefaultProfiles();
        System.err.println(JSON.json(activeProfiles));
        System.err.println(JSON.json(defaultProfiles));
        System.err.println(environment.getProperty("dubbo.registry.address"));
        System.err.println(sysAdminUserService.getSysAdminVO());
    }
}
