package com.hong.spi;

import java.util.ServiceLoader;

/**
 * Description     :
 */
public class App {
	public static void main(String[] args) {
		ServiceLoader<PrintService> serviceServiceLoader = ServiceLoader.load(PrintService.class);
		for (PrintService printService:serviceServiceLoader) {
			printService.printInfo();
		}
	}
}
