package com.kafeng.dao;

import com.kafeng.entries.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author huangjiafeng
 * @date 2020/5/6 9:46 上午
 */
@Mapper
public interface DeptDao {
     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();
}
