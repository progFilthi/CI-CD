package com.product.cicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello CI/CD pipeline.";
    }
}
