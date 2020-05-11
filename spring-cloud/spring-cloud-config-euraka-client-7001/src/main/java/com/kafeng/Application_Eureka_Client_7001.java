package com.kafeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huangjiafeng
 * @date 2020/5/6 4:42 下午
 */
@SpringBootApplication
@EnableEurekaServer
public class Application_Eureka_Client_7001 {
    public static void main(String[] args){
        SpringApplication.run(Application_Eureka_Client_7001.class,args);
    }
}
