package com.ggox.test;

import org.springframework.core.ResolvableType;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @Author: ggox
 * @Date: 2020/11/7 16:19
 * @Description: spring 泛型处理 api
 */
public class ResolvableTypeDemo<T,V> {

	private Map<String, List<String>> data;

	public Function<? super V, ? extends T> function;

	public static void main(String[] args) throws NoSuchFieldException {

		System.out.println("===========");
		ResolvableType t = ResolvableType.forField(ResolvableTypeDemo.class.getDeclaredField("data"));
		System.out.println(t.getSuperType());
		System.out.println(t.asMap());
		System.out.println(t.getGeneric(1).getGeneric(0).resolve());
		System.out.println(t.resolveGeneric(1,0));

		System.out.println("===========");
		class A extends ResolvableTypeDemo<String,Integer>{

		}
		A a = new A();
		ResolvableType type = ResolvableType.forClass(a.getClass());
		System.out.println(type.getSuperType().resolveGeneric(1));
	}

}
