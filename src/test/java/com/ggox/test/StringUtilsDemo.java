package com.ggox.test;

import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * @author: ggox
 * @date: 2020/11/7 21:00
 * @description:
 */
public class StringUtilsDemo {

	public static void main(String[] args) {
		String source = "234324,23423,4234234,;23423;23432;";
		String[] split = StringUtils.tokenizeToStringArray(source, ",;");
		System.out.println(Arrays.toString(split));
	}

}
