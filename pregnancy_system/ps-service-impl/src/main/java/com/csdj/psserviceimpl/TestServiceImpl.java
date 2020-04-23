package com.csdj.psserviceimpl;

import com.csdj.pojo.Test;

import com.csdj.psdao.TestDao;
import com.csdj.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao dao;
    @Override
    public List<Test> findUsersAll() {
        return dao.selectAll();
    }
}
