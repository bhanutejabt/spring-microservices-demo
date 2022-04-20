package com.springmicroservicesdemo.cloudgateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallback")
    public String userServiceFallBackMethod() {
        return "UserService is taking longer than expected try again later";
    }

    @GetMapping("/departmentServiceFallBack")
    public String departmentServiceFallBack() {
        return "DepartmentService is taking longer than expected try again later";
    }
}
