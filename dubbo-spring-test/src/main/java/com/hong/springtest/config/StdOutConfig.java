package com.hong.springtest.config;

import com.hong.spring.service.LogService;
import com.hong.spring.service.impl.StdOutLogServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description     :
 */
@Configuration
public class StdOutConfig {

	@Bean(name = "stdOutLogServiceImpl")
	public LogService stdOutLogServiceImpl(){
		return new StdOutLogServiceImpl();
	}


}
