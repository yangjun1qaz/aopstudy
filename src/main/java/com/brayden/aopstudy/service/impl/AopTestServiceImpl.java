package com.brayden.aopstudy.service.impl;

import com.brayden.aopstudy.service.AopTestService;
import org.springframework.stereotype.Service;

/**
 * @author Brayden
 * @version 1.0
 * @date 2020/8/10
 */
@Service
public class AopTestServiceImpl implements AopTestService {
    @Override
    public void aopTest() {
        System.out.println("我是业务测试1");
    }

    @Override
    public void aopTest1() {
        System.out.println("我是业务测试2");
        throw new RuntimeException();
    }
}
