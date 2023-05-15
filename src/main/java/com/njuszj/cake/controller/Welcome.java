package com.njuszj.cake.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @Value("${systemVersion:unknown}")
    private String sysVersion;
    @Value("${apiVersion:unknown}")
    private String apiVersion;

    @RequestMapping(value="/", method=RequestMethod.GET, produces="application/json;charset=UTF-8")
    public String index(){
        return "Hello, welcome to cake system!";
    }

    @GetMapping(value="/api/version")
    public String apiVersion(){
        return apiVersion;
    }

    @GetMapping(value="/sys/version")
    public String sysVersion(){
        return sysVersion;
    }
}
