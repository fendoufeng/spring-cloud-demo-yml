package com.kafeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author huangjiafeng
 * @date 2020/5/6 10:12 上午
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
public class Application_Prot8001_Hystrix {
    public static void main(String[] args){
        SpringApplication.run(Application_Prot8001_Hystrix.class,args);
    }
}
