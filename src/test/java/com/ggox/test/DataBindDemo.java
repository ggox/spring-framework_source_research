package com.ggox.test;

import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.validation.DataBinder;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: ggox
 * @Date: 2020/10/31 20:37
 * @Description: TODO
 */
public class DataBindDemo {

	@Test
	public void name() {
		Map<String, String> source = new HashMap<>();
		source.put("name", "ggox");
		source.put("value", "max");
		PropertyValues propertyValues = new MutablePropertyValues(source);
		User user = new User();
		DataBinder userDataBinder = new DataBinder(user, "user");
		userDataBinder.bind(propertyValues);
		System.out.println(user);
	}

	static class User {

		String name;

		String value;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		@Override
		public String toString() {
			return "User{" + "name='" + name + '\'' + ", value='" + value + '\'' + '}';
		}
	}

}
