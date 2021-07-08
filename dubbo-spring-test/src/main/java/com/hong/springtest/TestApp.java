package com.hong.springtest;

import com.hong.spring.service.LogService;
import com.hong.springtest.bean.ImportBean;
import com.hong.springtest.config.LogParentConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Description     :
 */
public class TestApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LogParentConfig.class);

		// 控制台
		LogService obj = (LogService) context.getBean("stdOutLogServiceImpl");
		System.out.println(obj);
		obj.print("控制台输出");

		// file
		obj = (LogService) context.getBean("fileLogServiceImpl");
		System.out.println(obj);
		obj.print("文件输出");

		// mysql
		obj = (LogService) context.getBean("mysqlLogServiceImpl");
		System.out.println(obj);
		obj.print("数据库mysql");


		ImportBean importBean = context.getBean(ImportBean.class);
		importBean.printOut();

		context.close();
	}
}
