package com.example.demo.hello.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.hello.web.model.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper extends BaseMapper<Test> {
}
