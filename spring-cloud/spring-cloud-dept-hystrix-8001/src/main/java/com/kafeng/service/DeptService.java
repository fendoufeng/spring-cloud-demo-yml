package com.kafeng.service;

import com.kafeng.entries.Dept;

import java.util.List;

/**
 * @author huangjiafeng
 * @date 2020/5/6 9:47 上午
 */
public interface DeptService {

     boolean add(Dept dept);

     Dept get(Long id);

     List<Dept> list();
}
