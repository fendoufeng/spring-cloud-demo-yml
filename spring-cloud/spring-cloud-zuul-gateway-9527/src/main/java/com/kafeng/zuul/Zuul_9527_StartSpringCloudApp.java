package com.kafeng.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author huangjiafeng
 * @date 2020/5/11 10:53 上午
 */
@SpringBootApplication
@EnableZuulProxy

public class Zuul_9527_StartSpringCloudApp {
    public static void main(String[] args){
        SpringApplication.run(Zuul_9527_StartSpringCloudApp.class,args);
    }
}
