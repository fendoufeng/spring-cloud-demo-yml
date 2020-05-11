package com.kafeng.controller;


import com.kafeng.entries.Dept;
import com.kafeng.service.DeptClientService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author huangjiafeng
 * @date 2020/5/6 9:59 上午
 */
@RestController
public class DeptController {

    @Autowired
    private DeptClientService deptClientService;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_GET")
    public Dept get(@PathVariable("id") Long id){
        Dept dept = deptClientService.get(id);
        if (null == dept){
            throw new RuntimeException("not find data");
        }
        return dept;
    }

    public Dept processHystrix_GET(@PathVariable("id") Long id){
        Dept dept = new Dept().setDeptno(id).setDname("该ID：" + id + "没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭").setDb_source("no this database in MySQL");
        return dept;
    }

    @RequestMapping(value = "dept/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept){
        return deptClientService.add(dept);
    }

    @RequestMapping(value = "dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return deptClientService.list();
    }

    @RequestMapping(value = "dept/discovery",method = RequestMethod.GET)
    public Object discovery(){

        List<String> discoveryList = discoveryClient.getServices();

        System.out.println("========="+discoveryList);


        List<ServiceInstance> srvList = discoveryClient.getInstances("SPRING-CLOUD-DEPT");

        for (ServiceInstance element: srvList) {
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort()+"\t"+element.getUri());
        }

        return this.discoveryClient;
    }



}
