package com.lh.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @BelongsProject: springcloud-demo
 * @BelongsPackage: com.lh.springcloud.pojo
 * @Author: LHao
 * @CreateTime: 2023-10-27  12:32
 * @Description: TODO
 * @Version: 1.0
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;
    private String dname;

    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }

}
