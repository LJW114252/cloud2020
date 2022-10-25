package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author ljw
 * @date 2022/10/24 22:57
 */

@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {

    public static void main(String[] args){
          SpringApplication.run(GateWayMain9527.class,args);
    }

}

