package com.cxyxh.activemq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class HelloWorldController {


    @RequestMapping("/hello")
    public String hell() {
        return "hello";
    }
}
