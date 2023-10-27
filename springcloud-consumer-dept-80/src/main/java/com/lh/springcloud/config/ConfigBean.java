package com.lh.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: springcloud-demo
 * @BelongsPackage: com.lh.springcloud.config
 * @Author: LHao
 * @CreateTime: 2023-10-27  14:10
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class ConfigBean {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
