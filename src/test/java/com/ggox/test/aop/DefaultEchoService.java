package com.ggox.test.aop;

/**
 * echoservice 默认实现
 *
 * @author: ggox
 * @date: 2021/1/9 下午9:46
 * @description:
 */
public class DefaultEchoService implements EchoService {

	@Override
	public void echo(String name) {
		System.out.println("hello world!");
	}
}
