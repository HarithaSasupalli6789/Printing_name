package com.postexample.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @PostMapping("/postbody")
    public String postBody(@RequestBody String fullName) {
        System.out.println("hello world");
        return "Hello " + fullName;
    }
}




