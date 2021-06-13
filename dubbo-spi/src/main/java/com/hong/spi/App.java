package com.hong.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

import java.util.ServiceLoader;

/**
 * Description     :
 */
public class App {
	public static void main(String[] args) {
		// JAVA原生 SPI
//		ServiceLoader<PrintService> serviceServiceLoader = ServiceLoader.load(PrintService.class);
//		for (PrintService printService:serviceServiceLoader) {
//			printService.printInfo();
//		}

		// Dubbo spi
		PrintService printService = ExtensionLoader.getExtensionLoader(PrintService.class).getDefaultExtension();
		printService.printInfo();
	}
}
