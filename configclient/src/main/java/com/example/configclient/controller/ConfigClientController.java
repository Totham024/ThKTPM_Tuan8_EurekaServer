package com.example.configclient.controller;

import com.example.configclient.config.ClientConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
@RequestScope //tu dong refesh du lieu tu git
public class ConfigClientController {
//    @Autowired
//    private ClientConfig clientConfig;
    @Value("${sample.property2}")
    private String property2;
    @RequestMapping("/config")
    public String readConfig(){
    return property2;
    }
}
