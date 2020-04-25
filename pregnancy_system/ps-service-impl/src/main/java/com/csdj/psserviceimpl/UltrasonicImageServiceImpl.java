package com.csdj.psserviceimpl;

import com.csdj.pojo.UltrasonicImage;
import com.csdj.psdao.fyq.UltrasonicImageDao;
import com.csdj.service.fyq.UltrasonicImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UltrasonicImageServiceImpl implements UltrasonicImageService {
    @Autowired
    private UltrasonicImageDao dao;

    @Override
    public UltrasonicImage getUI(UltrasonicImage ui) {
        return dao.selectOne(ui);
    }
}
