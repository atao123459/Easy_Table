package com.example.tableserver;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.example")
@Slf4j
public class TableserverApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(TableserverApplication.class,args);
        log.info("该服务的名称是:{}",context.getEnvironment().getProperty("spring.application.name"));
        log.info("该服务的启动端口是:{}",context.getEnvironment().getProperty("server.port"));

    }
}
