package com.hong.dubbo.usage.provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.hong.dubbo.usage.api.EchoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description     :
 */
@Service // 通过注解暴露
public class EchoServiceImpl implements EchoService {
	@Override
	public String echo(String message) {
		String now = new SimpleDateFormat("HH:mm:ss").format(new Date());
		System.out.println("["+now+"] Hello "+message+" , request from consumer: "+ RpcContext.getContext().getRemoteAddress());
		return message;
	}
}
