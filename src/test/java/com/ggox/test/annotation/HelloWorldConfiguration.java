package com.ggox.test.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ggox
 * @date: 2020/11/7 22:15
 * @description: hello world 模块配置类
 */
@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String helloWorld() {
		return "hello world";
	}

}
