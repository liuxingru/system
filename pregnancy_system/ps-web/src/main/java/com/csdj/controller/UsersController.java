package com.csdj.controller;

import com.csdj.pojo.Test;
import com.csdj.service.TestService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    @Autowired
    TestService servicea;

    @GetMapping("/show")
    public List<Test> show(){
        return servicea.findUsersAll();
    }
}
