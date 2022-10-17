package com.kidhub.api.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @RequestMapping("/userServiceFallBack")
    public String userServiceFallBackMethod() {
        System.out.println("INSIDE User Service Fallback");
        return "User Service is taking longer than expected, please try again later.";
    }

    @RequestMapping("/departmentServiceFallBack")
    public String departmentServiceFallBackMethod() {
        return "Department Service is taking longer than expected, please try again later.";
    }
}
