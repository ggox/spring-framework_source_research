package com.ggox.test;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.annotation.AnnotatedBeanDefinitionReader;

/**
 * @Author: ggox
 * @Date: 2020/8/19 00:42
 * @Description:
 */
public class BeanLifeCycleDemo {

	@Test
	public void xml() {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(beanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions("classpath://*.xml");
	}

	@Test
	public void properties() {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		PropertiesBeanDefinitionReader propertiesBeanDefinitionReader = new PropertiesBeanDefinitionReader(beanFactory);
		propertiesBeanDefinitionReader.loadBeanDefinitions("classpath://*.properties");
	}

	@Test
	public void annotatedBeanDefinitionParser() {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(beanFactory);
		// 不需要注解的 class
		reader.register(BeanLifeCycleDemo.class);
	}

	@Test
	public void mergedBeanDefinition() {
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);

	}
}
