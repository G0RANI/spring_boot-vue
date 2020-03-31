
package com.example.demo.controller;

import com.example.demo.service.CmmService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CmmController {

    @Autowired
    CmmService cmmService;

    @GetMapping("/test")
    public String test() {
        String test = "";
        test = cmmService.test();
        return test;
    }
    
}