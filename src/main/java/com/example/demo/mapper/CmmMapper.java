package com.example.demo.mapper;

import com.example.demo.domain.CmmDTO;

import org.apache.ibatis.annotations.Mapper;

/**
 * CmmMapper
 */
@Mapper
public interface CmmMapper {
    public CmmDTO test();
}