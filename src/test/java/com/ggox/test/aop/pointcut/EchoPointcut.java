package com.ggox.test.aop.pointcut;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.Objects;

/**
 * pointcut实现demo
 *
 * @author: ggox
 * @date: 2021/1/9 下午9:37
 * @description:
 */
public class EchoPointcut extends StaticMethodMatcherPointcut {

	private String methodName;

	private Class<?> targetClass;

	public EchoPointcut(String methodName, Class<?> targetClass) {
		this.methodName = methodName;
		this.targetClass = targetClass;
	}

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		return Objects.equals(method.getName(), methodName) && Objects.equals(this.targetClass, targetClass);
	}

}
