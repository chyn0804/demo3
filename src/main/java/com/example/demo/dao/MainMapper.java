package com.example.demo.dao;

import com.example.demo.vo.DptVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MainMapper {
    public DptVO getDpt() throws Exception;
}
