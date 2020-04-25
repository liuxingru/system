package com.csdj.controller.fyq;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.csdj.pojo.UltrasonicImage;
import com.csdj.service.fyq.UltrasonicImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@RequestMapping("/ui")
@Controller
public class UltrasonicImageController {
    @Autowired
    private UltrasonicImageService service;

    @RequestMapping(value = "/findUltrasonicImage",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object findUltrasonicImage(HttpSession session){
       // Record record=(Record) session.getAttribute("User");
        UltrasonicImage ultrasonicImage=new UltrasonicImage();
        ultrasonicImage.setCertificate("110101198603075436");
        return service.getUI(ultrasonicImage);
    }
}
