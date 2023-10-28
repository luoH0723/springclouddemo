package com.lh.springcloud;

import com.lh.myrule.MyLRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @BelongsProject: springcloud-demo
 * @BelongsPackage: com.lh.springcloud
 * @Author: LHao
 * @CreateTime: 2023-10-27  14:23
 * @Description: TODO
 * @Version: 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SPRINGCLOUD-PROVIDER-DEPT",configuration = MyLRule.class)
public class DeptConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_80.class,args);
    }
}
