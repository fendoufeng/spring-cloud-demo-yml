package com.kafeng.controller;


import com.kafeng.entries.Dept;
import com.kafeng.service.DeptClientService;

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
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
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
