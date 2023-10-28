package com.lh.springcloud.service.impl;

import com.lh.springcloud.dao.DeptDao;
import com.lh.springcloud.pojo.Dept;
import com.lh.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @BelongsProject: springcloud-demo
 * @BelongsPackage: com.lh.springcloud.service.impl
 * @Author: LHao
 * @CreateTime: 2023-10-27  13:22
 * @Description: TODO
 * @Version: 1.0
 */
@Service
public class DeptServceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    @Override
    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
