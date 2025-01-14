package com.senthil.SpringSecurityProject;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/input")
    public String getdetail(){
        System.out.println("input");
        return "Success";
    }

    @PostMapping("/securitycheck")
    public RequestEntity insertEmployee(){
        return null;
    }

}
