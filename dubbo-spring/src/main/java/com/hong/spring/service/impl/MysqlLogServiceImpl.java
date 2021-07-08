package com.hong.spring.service.impl;

import com.hong.spring.service.LogService;
import org.springframework.stereotype.Component;

/**
 * Description     :
 */
public class MysqlLogServiceImpl implements LogService {
	@Override
	public void print(String message) {
		System.out.println(message);
		System.out.println("写日志入数据库");
	}
}
