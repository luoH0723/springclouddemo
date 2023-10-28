package com.lh.springcloud.dao;

import com.lh.springcloud.pojo.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @BelongsProject: springcloud-demo
 * @BelongsPackage: com.lh.springcloud.dao
 * @Author: LHao
 * @CreateTime: 2023-10-27  13:05
 * @Description: TODO
 * @Version: 1.0
 */
@Mapper
@Repository
public interface DeptDao {

    public  boolean addDept(Dept dept);

    public Dept queryById(Long id);

    public List<Dept> queryAll();

}
