package com.example.demo.hello.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.hello.web.controller.TestController;
import com.example.demo.hello.web.mapper.TestMapper;
import com.example.demo.hello.web.model.Test;
import com.example.demo.hello.web.service.TestService;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, Test> implements TestService {

    @Override
    public String hello() {
        Test test = baseMapper.selectById(1);
        return  test.toString();
    }

    public static void main(String[] args) throws  NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取类的映射
        Class<Test> clazz = Test.class;
        //获取set方法
        Method method = clazz.getMethod("setId", Integer.class);
        Object object = clazz.getConstructor().newInstance();
        //执行 参数传入4
        method.invoke(object,4);
        Method method1 = clazz.getMethod("getId");
        System.out.println(method1.invoke(object));
    }
}
