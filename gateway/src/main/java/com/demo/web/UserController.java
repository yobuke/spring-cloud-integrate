package com.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yuzl19827 on 2017/7/7.
 */
@RestController
//@RequestMapping("/user")
public class UserController extends BaseController {

    //private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/service-instances/{applicationName}", method = RequestMethod.GET)
    public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName) {
        return this.client.getInstances(applicationName);
    }

    @RequestMapping(value = "/info", method = RequestMethod.GET)
    @ResponseBody
    public String info() {
        ServiceInstance instance = client.getLocalServiceInstance();
        //logger.info("/info, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "info";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        ServiceInstance instance = client.getLocalServiceInstance();
        //logger.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "hello";
    }
}
