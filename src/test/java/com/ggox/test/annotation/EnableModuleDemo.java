package com.ggox.test.annotation;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: ggox
 * @date: 2020/11/7 22:17
 * @description: enable 驱动示例
 */
@EnableHelloWorld
public class EnableModuleDemo {

	@Test
	public void test_enableModule() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(EnableModuleDemo.class);
		context.refresh();
		String bean = context.getBean("helloWorld", String.class);
		System.out.println(bean);
		context.close();
		Assert.assertEquals(bean,"hello world");
	}
}
