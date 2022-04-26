package com.lqw.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author by lqw
 * @Classname MyRule
 * @Desc TODO
 * @Date 2022/4/11 17:17
 */
@Configuration
public class MySelRule {

    @Bean
    public IRule myRule() {
        return new RandomRule();
    }

}
