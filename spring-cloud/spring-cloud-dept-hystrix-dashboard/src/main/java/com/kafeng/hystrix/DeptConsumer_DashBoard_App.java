package com.kafeng.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author huangjiafeng
 * @date 2020/5/11 9:53 上午
 */

@SpringBootApplication
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {
    public static void main(String[] args){
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }
}
