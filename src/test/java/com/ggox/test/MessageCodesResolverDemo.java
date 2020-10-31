package com.ggox.test;

import org.junit.Test;
import org.springframework.validation.DefaultMessageCodesResolver;

/**
 * @Author: ggox
 * @Date: 2020/10/31 22:19
 * @Description: 测试 MessageCodesResolver
 */
public class MessageCodesResolverDemo {

	@Test
	public void testMessageCodesResolver() {
		DefaultMessageCodesResolver messageCodesResolver = new DefaultMessageCodesResolver();
		String[] users = messageCodesResolver.resolveMessageCodes("01", "user", "name", String.class);
		for (String user : users) {
			System.out.println(user);
		}
	}
}
