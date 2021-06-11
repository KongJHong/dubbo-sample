package com.hong.dubbo.usage.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Description     : 基于XML的实现
 */
public class XmlEchoProvider {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/echo-provider.xml");
		context.start();
		System.in.read();
		context.close();
	}
}
