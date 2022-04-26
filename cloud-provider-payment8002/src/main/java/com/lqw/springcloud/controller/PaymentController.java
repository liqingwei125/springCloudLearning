package com.lqw.springcloud.controller;

import com.lqw.springcloud.entities.CommonResult;
import com.lqw.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;
import com.lqw.springcloud.service.PaymentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author by lqw
 * @Classname PaymentController
 * @Desc TODO
 * @Date 2022/3/10 21:03
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*********插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "成功！serverPort: "+ serverPort);
        } else {
            return new CommonResult(444, "失败！");
        }
    }

    @GetMapping(value = "/payment/getPaymentById/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id")Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*********查询结果111111111111：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功！serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询Id："+ id, null);
        }
    }

    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        List<String> services = discoveryClient.getServices();
        for (String element: services) {
            log.info("******* element: " + element);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for (ServiceInstance instance : instances) {
            log.info(instance.getServiceId() + "\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLb() {
        return serverPort;
    }

}
