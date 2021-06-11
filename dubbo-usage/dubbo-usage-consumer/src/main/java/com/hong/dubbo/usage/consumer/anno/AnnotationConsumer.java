package com.hong.dubbo.usage.consumer.anno;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Description     :
 */
public class AnnotationConsumer {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
		context.start();
		EchoConsumer echoService = context.getBean(EchoConsumer.class);
		String hello = echoService.echo("Hello world!");
		System.out.println("result: "+hello);
	}

	@Configuration
	@EnableDubbo(scanBasePackages = "com.hong.dubbo.usage.consumer.anno")
	@ComponentScan(value = {"com.hong.dubbo.usage.consumer.anno"})
	static class ConsumerConfiguration {

		@Bean
		public ApplicationConfig applicationConfig() {
			ApplicationConfig applicationConfig = new ApplicationConfig();
			applicationConfig.setName("echo-annotation-consumer");
			return applicationConfig;
		}

		@Bean
		public ConsumerConfig consumerConfig() {
			return new ConsumerConfig();
		}

		@Bean
		public RegistryConfig registryConfig() {
			RegistryConfig registryConfig = new RegistryConfig();
			registryConfig.setProtocol("zookeeper");
			registryConfig.setAddress("192.168.168.120");
			registryConfig.setPort(2181);
			return registryConfig;
		}
	}
}
