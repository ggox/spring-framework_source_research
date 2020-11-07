package com.ggox.test;

import org.springframework.core.ResolvableType;

import java.util.List;
import java.util.Map;

/**
 * @Author: ggox
 * @Date: 2020/11/7 16:19
 * @Description: spring 泛型处理 api
 */
public class ResolvableTypeDemo {

	private Map<String, List<String>> data;

	public static void main(String[] args) throws NoSuchFieldException {
		ResolvableType t = ResolvableType.forField(ResolvableTypeDemo.class.getDeclaredField("data"));
		System.out.println(t.getSuperType());
		System.out.println(t.asMap());
		System.out.println(t.getGeneric(1).getGeneric(0).resolve());
		System.out.println(t.resolveGeneric(1,0));
	}

}
