package com.ggox.test;

import org.junit.Test;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.io.IOException;
import java.io.StringReader;
import java.util.Map;
import java.util.Properties;

/**
 * @Author: ggox
 * @Date: 2020/11/1 19:54
 * @Description: 通过扩展 PropertyEditor 实现类型转换
 */
public class PropertyEditorDemo {

 	@Test
	public void PropertyEditorTypeConverterDemo() {
		// 原始数据
		String text = "name = xiaowang";
		// 定义 PropertyEditor 作为转换器使用
		PropertyEditor propertyEditor = new PropertyEditorSupport() {
			@Override
			public void setAsText(String text) throws IllegalArgumentException {
				Properties properties = new Properties();
				try {
					properties.load(new StringReader(text));
				} catch (IOException e) {
					e.printStackTrace();
				}
				this.setValue(properties);
			}

			@Override
			public String getAsText() {
				Properties properties = (Properties) getValue();
				if (properties == null) {
					return "";
				}
				StringBuilder sb = new StringBuilder();
				for (Map.Entry<Object, Object> objectObjectEntry : properties.entrySet()) {
					sb.append(objectObjectEntry.getKey()).append(" = ").append(objectObjectEntry.getValue()).append(System.getProperty("line.separator"));
				}
				return sb.toString();
			}
		};
		// 设置值
		propertyEditor.setAsText(text);
		// 获取转换后的值
		System.out.println(propertyEditor.getValue());
	}
}
