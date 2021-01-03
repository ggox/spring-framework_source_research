package com.ggox.test.aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 使用aspectJ api创建代理
 *
 * @author: ggox
 * @date: 2021/1/3 下午5:49
 * @description:
 */
public class AspectJAnnotationUsingAPIDemo {

	public static void main(String[] args) {

		Map<String, Object> cache = new HashMap<>();

		AspectJProxyFactory proxyFactory = new AspectJProxyFactory(cache);

		proxyFactory.addAspect(AspectJConfiguration.class);

		proxyFactory.addAdvice((MethodBeforeAdvice) (method, args1, target) -> {
			if ("put".equals(method.getName()) && args1.length == 2) {
				System.out.printf("当前存储的key为 %s,value为 %s \n", args1[0], args1[1]);
			}
		});

		Map<String,Object> proxy = proxyFactory.getProxy();
		proxy.put("key", "张三");
	}

}
