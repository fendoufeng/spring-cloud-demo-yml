package com.kafeng.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangjiafeng
 * @date 2020/5/8 10:14 下午
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule iRule(){
       // return new RandomRule();
        return new RandomRuleFiveTime();
    }

}
