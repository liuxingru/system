package com.csdj.serviceimpl.fyq;

import com.csdj.pojo.UltrasonicImage;
import com.csdj.dao.fyq.UltrasonicImageDao;
import com.csdj.service.fyq.UltrasonicImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UltrasonicImageServiceImpl implements UltrasonicImageService {
    @Autowired
    private UltrasonicImageDao dao;

    @Override
    public UltrasonicImage getUI(String certificate) {
        return dao.findUI(certificate);
    }
}
