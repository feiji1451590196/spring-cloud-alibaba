package com.feigong.nacosprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: spring-cloud-alibaba
 * @description: ${description}
 * @author: Mr.feiji
 * @create: 2019-09-06 23:58
 **/
@RestController
public class Provider {
    @GetMapping(value = "/provider/{str}")
    public String provider(@PathVariable String str) {
        return "HI this is the provider " + str;
    }
}
