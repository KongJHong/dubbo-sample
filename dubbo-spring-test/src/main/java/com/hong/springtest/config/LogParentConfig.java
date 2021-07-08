package com.hong.springtest.config;

import com.hong.springtest.bean.ImportBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Description     :
 */
@Configuration
@Import({StdOutConfig.class, FileLogConfig.class, MysqlLogConfig.class, ImportBean.class})
public class LogParentConfig {
}
