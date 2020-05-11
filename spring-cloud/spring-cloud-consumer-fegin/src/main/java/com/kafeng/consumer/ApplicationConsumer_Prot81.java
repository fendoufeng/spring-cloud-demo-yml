package com.kafeng.consumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author huangjiafeng
 * @date 2020/5/6 2:14 下午
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.kafeng"})
@ComponentScan("com.kafeng")
public class ApplicationConsumer_Prot81 {
    public static void main(String[] args){
        SpringApplication.run(ApplicationConsumer_Prot81.class,args);
    }
}
