package com.wds.micro.service.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 *
 * Created by wangdongsong on 2016/3/27.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication{

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }

}
