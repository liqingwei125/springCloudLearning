package com.lqw.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author by lqw
 * @Desc 自定义算法
 */
public interface LoadBalanced {

    /**
     * 轮询算法
     * @param instanceList 服务节点入参
     * @return 服务名
     */
    ServiceInstance instance(List<ServiceInstance> instanceList);

}
