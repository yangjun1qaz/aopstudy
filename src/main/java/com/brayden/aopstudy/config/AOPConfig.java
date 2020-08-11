package com.brayden.aopstudy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Brayden
 * @version 1.0
 * @date 2020/8/10
 */
@ComponentScan("com.brayden.aopstudy")
@Configuration
@EnableAspectJAutoProxy
public class AOPConfig {
}
