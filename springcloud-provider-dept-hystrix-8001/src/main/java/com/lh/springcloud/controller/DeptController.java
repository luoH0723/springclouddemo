package com.lh.springcloud.controller;

import com.lh.springcloud.pojo.Dept;
import com.lh.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @BelongsProject: springcloud-demo
 * @BelongsPackage: com.lh.springcloud.controller
 * @Author: LHao
 * @CreateTime: 2023-10-27  13:25
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
//@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;


    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id") Long id){
        Dept dept= deptService.queryById(id);
        if (dept==null){
            throw new RuntimeException("id->"+id+",用户不存在");
        }
        return dept;
    }


    public Dept hystrixGet(@PathVariable("id") Long id){
        return new Dept().setDeptno(id).setDname("id->"+id+",用户不存在").setDb_source("id->"+id+",数据不存在");
    }

//    @Autowired
//    private DeptService deptService;
//
//    @Autowired
//    private DiscoveryClient client;
//
//    @PostMapping("/dept/add")
//    public boolean addDept(Dept dept){
//        return deptService.addDept(dept);
//    }
//
//    @GetMapping("/dept/get/{id}")
//    public Dept getDept(@PathVariable("id")Long id){
//        return deptService.queryById(id);
//    }
//
//    @GetMapping("/dept/getAll")
//    public List<Dept> getAllDept(){
//        return deptService.queryAll();
//    }
//
//    @GetMapping("/dept/discovery")
//    public Object discovery() {
//        List<String> services = client.getServices();
//        System.out.println("discovery=>services"+services);
//
//        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");
//
//        for (ServiceInstance instance : instances){
//            System.out.println(instance.getHost()+"\t"+
//                    instance.getPort()+"\t"+
//                    instance.getUri()+"\t"+
//                    instance.getServiceId()+"\t");
//        }
//
//        return this.client;
//    }

}
