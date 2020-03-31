package com.example.demo.service;

import com.example.demo.domain.CmmDTO;
import com.example.demo.mapper.CmmMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CmmServiceImpl
 */
@Service
public class CmmServiceImpl implements CmmService {
    
    @Autowired
    private CmmMapper cmmMapper;

    @Autowired
    private CmmDTO cmmDTO;

    @Override
    public String test() {
        String test = "";
        cmmDTO = cmmMapper.test();
        test = cmmDTO.getTest();
        return test;
    }
    
}