package com.brayden.aopstudy;

import com.brayden.aopstudy.config.AOPConfig;
import com.brayden.aopstudy.service.AopTestService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Brayden
 * @version 1.0
 * @date 2020/8/10
 */
public class AopTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(AOPConfig.class);
        AopTestService aopTestServiceImpl = (AopTestService) acp.getBean("aopTestServiceImpl");
        aopTestServiceImpl.aopTest();
        System.out.println("---------------------------------");
        aopTestServiceImpl.aopTest1();
    }
}
