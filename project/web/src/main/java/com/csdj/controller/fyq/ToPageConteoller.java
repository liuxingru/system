package com.csdj.controller.fyq;

import com.csdj.pojo.Record;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class ToPageConteoller {
    @RequestMapping("/{page}")
    public String toPage(@PathVariable("page") String page, HttpSession session){
       Record record=new Record();
        record.setFname("张三");
        record.setBname("李四");
        record.setRid(1122342334);
        record.setBirth(new Date());
        record.setFbirth(new Date());
        record.setBcertificate("24345252352323432");
        record.setFcertificate("24345252352323432");
        record.setBaccount("农村户口");
        record.setFaccount("农村户口");
        session.setAttribute("record",record);
        System.out.println("1111111111111111");
        return page;
    }
}
