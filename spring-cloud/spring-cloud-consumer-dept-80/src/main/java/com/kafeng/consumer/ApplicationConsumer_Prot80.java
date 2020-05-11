package com.kafeng.consumer;

import com.kafeng.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author huangjiafeng
 * @date 2020/5/6 2:14 下午
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SPRING-CLOUD-DEPT",configuration= MySelfRule.class)
public class ApplicationConsumer_Prot80 {
    public static void main(String[] args){
        SpringApplication.run(ApplicationConsumer_Prot80.class,args);
    }
}
