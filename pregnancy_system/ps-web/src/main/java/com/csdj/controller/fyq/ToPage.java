package com.csdj.controller.fyq;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ToPage {
    @RequestMapping("/{page}")
    public String toPage(@PathVariable("page") String page){
        System.out.println("1111111111111111");
        return page;
    }
}
