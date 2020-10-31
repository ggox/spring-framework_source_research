package com.ggox.test;

import com.ggox.test.DataBindDemo.User;
import org.junit.Test;

import java.beans.*;
import java.lang.reflect.Method;

/**
 * @Author: ggox
 * @Date: 2020/10/31 21:45
 * @Description: java beans 样例
 */
public class JavaBeansDemo {

	@Test
	public void testJavaBeans() throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(User.class);
		// 属性描述
		PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
		for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
			Method readMethod = propertyDescriptor.getReadMethod();
			Method writeMethod = propertyDescriptor.getWriteMethod();
			System.out.println("readMethod:" + readMethod);
			System.out.println("writeMethod:" + writeMethod);
		}

		// 方法描述
		MethodDescriptor[] methodDescriptors = beanInfo.getMethodDescriptors();
		for (MethodDescriptor methodDescriptor : methodDescriptors) {
			Method method = methodDescriptor.getMethod();
			System.out.println("method:" + method);
			ParameterDescriptor[] parameterDescriptors = methodDescriptor.getParameterDescriptors();
			if (parameterDescriptors == null) {
				continue;
			}
			for (ParameterDescriptor parameterDescriptor : parameterDescriptors) {
				System.out.println(parameterDescriptor.getName());
			}
		}
	}
}
