package com.hong.dubbo.usage.provider;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.ProviderConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Description     :
 */
public class AnnotationProvider {
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProviderConfiguration.class);
		context.start();
		System.in.read();
	}

	@Configuration
	@EnableDubbo(scanBasePackages = "com.hong.dubbo.usage.provider") // 1. 指定扫描服务所在的包
	static class ProviderConfiguration {
		@Bean
		public ProviderConfig providerConfig() {
			return new ProviderConfig();
		}

		@Bean
		public ApplicationConfig applicationConfig() {
			ApplicationConfig applicationConfig = new ApplicationConfig();
			applicationConfig.setName("echo-annotation-provider");
			return applicationConfig;
		}

		// 使用zookeeper作为注册中心，同时给出注册中心的ip
		@Bean
		public RegistryConfig registryConfig() {
			RegistryConfig registryConfig = new RegistryConfig();
			registryConfig.setProtocol("zookeeper");
			registryConfig.setAddress("192.168.168.120");
			registryConfig.setPort(2181);
			return registryConfig;
		}

		@Bean
		public ProtocolConfig protocolConfig() {
			ProtocolConfig protocolConfig = new ProtocolConfig();
			protocolConfig.setName("dubbo"); // 默认服务使用dubbo协议，在20880端口监听服务
			protocolConfig.setPort(20880);
			return protocolConfig;
		}
	}
}
