package com.lqw.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author by lqw
 * @Classname ApplicationContextConfig
 * @Desc TODO
 * @Date 2022/3/11 17:20
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    //@LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
