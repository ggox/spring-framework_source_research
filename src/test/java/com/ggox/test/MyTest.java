package com.ggox.test;

import org.junit.Test;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.util.StringUtils;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author: ggox
 * @Date: 2018-12-23 17:34
 */
public class MyTest {


	@Test
	public void test2(){
		String str = "1231,12312,12312,222,,33,45,334,3,3";
		String[] strings = StringUtils.tokenizeToStringArray(str, ",");
		Arrays.stream(strings).forEach(System.out::println);
	}

	@Test
	public void test3() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String");
		Object o = Array.newInstance(clazz, 0);
		Class<?> aClass = o.getClass();
		System.out.println(clazz);
		System.out.println(aClass);
	}
	@Test
	public void testFreezeConfiguration() {
		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition(MyTest.class).getBeanDefinition();
		System.out.println(beanDefinition.getClass());
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		beanFactory.freezeConfiguration();
		System.out.println(beanFactory.isConfigurationFrozen());
		System.out.println(Arrays.toString(beanFactory.getBeanDefinitionNames()));
		beanFactory.registerBeanDefinition("user", beanDefinition);
		System.out.println(beanFactory.isConfigurationFrozen());
		System.out.println(Arrays.toString(beanFactory.getBeanDefinitionNames()));
	}

}
