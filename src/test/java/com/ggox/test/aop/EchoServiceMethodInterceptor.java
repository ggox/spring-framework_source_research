package com.ggox.test.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * echo service interceptor
 *
 * @author: ggox
 * @date: 2021/1/9 下午9:43
 * @description:
 */
public class EchoServiceMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("before");
		Object proceed = invocation.proceed();
		System.out.println("after");
		return proceed;
	}
}
