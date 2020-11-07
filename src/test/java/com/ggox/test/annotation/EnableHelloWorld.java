package com.ggox.test.annotation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author: ggox
 * @date: 2020/11/7 22:14
 * @description: 激活 helloworld 模块
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(HelloWorldConfiguration.class)
public @interface EnableHelloWorld {

}
