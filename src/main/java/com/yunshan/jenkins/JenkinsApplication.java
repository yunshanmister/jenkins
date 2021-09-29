package com.yunshan.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangminghui
 * @Date: 2021/9/29 16:45
 */

@SpringBootApplication
@RestController
public class JenkinsApplication {
    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello jenkins";
    }

}
