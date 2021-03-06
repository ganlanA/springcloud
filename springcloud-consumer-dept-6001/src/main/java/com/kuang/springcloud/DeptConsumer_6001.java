package com.kuang.springcloud;


import com.kuang.myrule.KuangRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

//Ribbon和Eureka整合后，客户端直接调用,不用担心ip地址和端口号
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "SPRINGCLOUD-PROVIDER-DEPT", configuration = KuangRule.class)
public class DeptConsumer_6001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_6001.class, args);
    }
}

//p12
//12:20
