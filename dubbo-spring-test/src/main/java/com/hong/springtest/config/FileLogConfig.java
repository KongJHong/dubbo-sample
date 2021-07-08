package com.hong.springtest.config;

import com.hong.spring.service.LogService;
import com.hong.spring.service.impl.FileLogServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description     :
 */
@Configuration
public class FileLogConfig {

	@Bean(name = "fileLogServiceImpl")
	public LogService fileLogServiceImpl() {
		return new FileLogServiceImpl();
	}
}
