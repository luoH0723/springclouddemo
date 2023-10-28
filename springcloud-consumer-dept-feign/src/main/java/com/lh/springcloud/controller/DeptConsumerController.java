package com.lh.springcloud.controller;

import com.lh.springcloud.pojo.Dept;
import com.lh.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @BelongsProject: springcloud-demo
 * @BelongsPackage: com.lh.springcloud.controller
 * @Author: LHao
 * @CreateTime: 2023-10-27  13:51
 * @Description: TODO
 * @Version: 1.0
 */
@RestController
public class DeptConsumerController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private DeptClientService deptClientService;

//    private static final String REST_URL_PREFIX="http://SPRINGCLOUD-PROVIDER-DEPT";
//    private static final String REST_URL_PREFIX = "http://localhost:8001";

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return this.deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/getAll")
    public List<Dept> getAll(){
        return this.deptClientService.queryAll();
    }

}
