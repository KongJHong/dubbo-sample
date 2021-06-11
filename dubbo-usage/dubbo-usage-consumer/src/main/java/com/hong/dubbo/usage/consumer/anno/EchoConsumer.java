package com.hong.dubbo.usage.consumer.anno;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hong.dubbo.usage.api.EchoService;
import org.springframework.stereotype.Component;

/**
 * Description     : 基于注解的服务
 */
@Component
public class EchoConsumer {

	@Reference
	private EchoService echoService;

	public String echo(String name) {
		return echoService.echo(name);
	}
}
