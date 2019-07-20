package com.dustyding.microservice.limitesservice;

import com.dustyding.microservice.limitesservice.bean.LimitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigController {

    @Autowired
    private Config config;

    @GetMapping("/limits")
    public LimitConfig retrieveLimitsFromConfig(){

        return new LimitConfig(config.getMax(),config.getMin());
    }
}
