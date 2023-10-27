package com.lh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @BelongsProject: springcloud-demo
 * @BelongsPackage: com.lh.springcloud
 * @Author: LHao
 * @CreateTime: 2023-10-27  14:48
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer//eureka服务端启动类
public class EurekaServer_7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7002.class,args);
    }
}
