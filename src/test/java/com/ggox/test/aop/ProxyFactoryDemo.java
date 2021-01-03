package com.ggox.test.aop;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * ProxyFactory 示例
 *
 * @author: ggox
 * @date: 2021/1/3 下午6:18
 * @description:
 */
public class ProxyFactoryDemo {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		ProxyFactory proxyFactory = new ProxyFactory(map);
		proxyFactory.addAdvice((MethodBeforeAdvice) (method, args1, target) -> {
			if ("put".equals(method.getName()) && args1.length == 2) {
				System.out.printf("当前存储的key为 %s,value为 %s \n", args1[0], args1[1]);
			}
		});
		@SuppressWarnings("unchecked")
		Map<String, Object> proxy = (Map<String, Object>) proxyFactory.getProxy();
		proxy.put("key", "张三");
	}

}
