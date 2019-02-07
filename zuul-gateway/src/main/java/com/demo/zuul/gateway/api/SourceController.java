package com.demo.zuul.gateway.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * SourceController
 *
 * @author 10905 2019/2/6
 * @version 1.0
 */
@RestController
public class SourceController {
    @RequestMapping(value = "/source/hello/{name}",method = RequestMethod.GET)
    public String hello(@PathVariable("name") String name){
        System.out.println("----------跳转路由API------------输入的名字是:   "+name);
        return "hello,跳转路由:"+name;
    }
}
