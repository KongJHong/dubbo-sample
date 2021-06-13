package com.hong.spi;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * Description     :
 */
@SPI("impl")
public interface PrintService {

	void printInfo();
}
