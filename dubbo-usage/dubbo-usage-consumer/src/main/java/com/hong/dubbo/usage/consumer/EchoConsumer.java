package com.hong.dubbo.usage.consumer;

import com.hong.dubbo.usage.api.EchoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Description     :  基于XML的实现
 */
public class EchoConsumer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/echo-consumer.xml");
		context.start();
		EchoService echoService = (EchoService) context.getBean("echoService");
		String status = echoService.echo("Hello world!");
		System.out.println("echo result: "+ status);
	}
}
