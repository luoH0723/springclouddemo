package com.lh.springcloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
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

    /**
     * 负载均衡策略
     * IRule
     * RoundRobinRule 轮询
     * RandomRule  随机
 * AvailablityFiteringRule: 会先过滤掉，跳闸，访问故障的服务~,剩下的进行轮询
     * RetryRule 会酰胺轮询获取服务~，如果服务获取失败，则会在指定的时间内进行，重试
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }

}
