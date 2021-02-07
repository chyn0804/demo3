package com.example.demo.service.impl;

import com.example.demo.dao.MainMapper;
import com.example.demo.service.MainService;
import com.example.demo.vo.DptVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImpl implements MainService {
    @Autowired
    MainMapper mainRepository;

    @Override
    public DptVO getDpt() throws Exception {
        return mainRepository.getDpt();
    }
}
