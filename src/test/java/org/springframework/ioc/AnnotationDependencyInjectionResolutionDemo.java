package org.springframework.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @Author: ggox
 * @Date: 2020/7/23 01:20
 * @Description:
 */
public class AnnotationDependencyInjectionResolutionDemo {

	@Autowired
	private User user;


	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AnnotationDependencyInjectionResolutionDemo.class);
		context.refresh();

		AnnotationDependencyInjectionResolutionDemo demo = context.getBean(AnnotationDependencyInjectionResolutionDemo.class);
		System.out.println(demo.user);

		context.close();
	}

	@Bean
	public User user() {
		User user = new User();
		user.setAge(12);
		user.setName("user");
		return user;
	}

	@Bean
	public User superUser() {
		User user = new User();
		user.setName("superUser");
		user.setAge(40);
		return user;
	}

	static class User {

		private String name;
		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
		}
	}
}
