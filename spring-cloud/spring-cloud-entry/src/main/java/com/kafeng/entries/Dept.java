package com.kafeng.entries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author huangjiafeng
 * @date 2020/5/6 9:40 上午
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@Accessors(chain = true)
public class Dept {

    private Long deptno;
    private String dname;
    private String db_source;

}
