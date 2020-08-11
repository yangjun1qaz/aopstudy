package com.brayden.aopstudy.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 切面
 *
 * @author Brayden
 * @version 1.0
 * @date 2020/8/10
 */

@Aspect
@Component
public class AspectJTest {


    /**
     * 切点      "execution(* com.brayden.aopstudy.service..*.*(..))"这个是连接点
     */
    @Pointcut("execution(* com.brayden.aopstudy.service..*.*(..))")
    public void pointCut() {

    }
    /**
     * 通知
     */
    @Before("pointCut()")
    public void before() {
        System.out.println("切面执行了，我是在业务执行之前执行");
    }

    @After("pointCut()")
    public void after() {
        System.out.println("切面执行了，我是在业务执行之后执行");
    }

    @AfterThrowing("pointCut()")
    public void doRecoveryActions() {
        System.out.println("抛异常了，切面生效");
    }

}
