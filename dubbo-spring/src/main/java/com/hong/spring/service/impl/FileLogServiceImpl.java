package com.hong.spring.service.impl;

import com.hong.spring.service.LogService;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Description     :
 */
public class FileLogServiceImpl implements LogService {

	private static final String FILE_NAME = "d://LogService.txt";

	@Override
	public void print(String message) {

		try {
			File file = new File(FILE_NAME);
			FileWriter fw = new FileWriter(file, true);
			fw.write(message+"\n");
			fw.close();

			System.out.println(message);
			System.out.println("系日志到文件!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
