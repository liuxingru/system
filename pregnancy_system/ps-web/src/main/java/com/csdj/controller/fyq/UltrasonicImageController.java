package com.csdj.controller.fyq;

import com.csdj.pojo.Record;
import com.csdj.pojo.UltrasonicImage;
import com.csdj.service.fyq.UltrasonicImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@RequestMapping("/ui")
@Controller
public class UltrasonicImageController {
    @Autowired
    private UltrasonicImageService service;
    public Object findUltrasonicImage(HttpSession session){
       // Record record=(Record) session.getAttribute("User");
        UltrasonicImage ultrasonicImage=new UltrasonicImage();
        ultrasonicImage.setCertificate("110101198603075436");
        return service.getUI(ultrasonicImage);
    }
}
