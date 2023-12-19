package com.plugin.collect;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.plugin.collect.mapper")
public class PluginCollectApplication {

    public static void main(String[] args) {
        SpringApplication.run(PluginCollectApplication.class, args);
    }

}
