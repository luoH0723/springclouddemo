package com.lh.springcloud.service;

import com.lh.springcloud.pojo.Dept;

import java.util.List;

/**
 * @BelongsProject: springcloud-demo
 * @BelongsPackage: com.lh.springcloud.service
 * @Author: LHao
 * @CreateTime: 2023-10-27  13:21
 * @Description: TODO
 * @Version: 1.0
 */
public interface DeptService {

    public  boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();

}
