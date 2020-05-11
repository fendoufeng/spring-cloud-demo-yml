package com.kafeng.service.Impl;

import com.kafeng.dao.DeptDao;
import com.kafeng.entries.Dept;
import com.kafeng.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangjiafeng
 * @date 2020/5/6 9:48 上午
 */
@Service
public class DeptClientServiceImpl implements DeptClientService {

    @Autowired
    private DeptDao deptDao;

    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }


    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    public List<Dept> list() {
        return deptDao.findAll();
    }
}
