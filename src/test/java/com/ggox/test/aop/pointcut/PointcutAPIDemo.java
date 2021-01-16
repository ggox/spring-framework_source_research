package com.ggox.test.aop.pointcut;

import com.ggox.test.aop.DefaultEchoService;
import com.ggox.test.aop.EchoService;
import com.ggox.test.aop.EchoServiceMethodInterceptor;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.support.DefaultPointcutAdvisor;

/**
 * api 实现 pointcut demo
 *
 * @author: ggox
 * @date: 2021/1/9 下午9:40
 * @description:
 */
public class PointcutAPIDemo {

	public static void main(String[] args) {
		EchoPointcut echoPointcut = new EchoPointcut("echo", DefaultEchoService.class);
		DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor(echoPointcut, new EchoServiceMethodInterceptor());
		ProxyFactory proxyFactory = new ProxyFactory(new DefaultEchoService());
		proxyFactory.addAdvisor(advisor);

		EchoService proxy = (EchoService) proxyFactory.getProxy();
		proxy.echo("张三");
	}

}
