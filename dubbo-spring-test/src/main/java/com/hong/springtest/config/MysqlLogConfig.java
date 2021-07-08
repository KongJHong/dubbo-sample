package com.hong.springtest.config;

import com.hong.spring.service.LogService;
import com.hong.spring.service.impl.MysqlLogServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description     :
 */
@Configuration
public class MysqlLogConfig {

	@Bean(name = "mysqlLogServiceImpl")
	public LogService mysqlLogServiceImpl() {
		return new MysqlLogServiceImpl();
	}
}
