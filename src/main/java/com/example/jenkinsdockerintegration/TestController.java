package com.example.jenkinsdockerintegration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/message")
    public String getMessage(){
        System.out.println("enkins-docker-integration-message SO................");
        return "jenkins-docker-integration-message";

    }
}
