package com.ggox.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.ResolvableType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: ggox
 * @Date: 2020/11/6 19:16
 * @Description: 类型转换服务demo
 */
public class ConversionServiceDemo {

	@Test
	public void testConversationService() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.refresh();
		annotationConfigApplicationContext.start();
		annotationConfigApplicationContext.stop();
		annotationConfigApplicationContext.close();
	}

}
