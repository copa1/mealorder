package com.copa.mealorder.config;

import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  12.21
 *  基于JavaConfig配置MyBatis的配置文件方式写sql语句的扫描包
 */
@Configuration
public class MyBatisScannerConfig {

    @Bean
    public static MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("com.copa.mealorder.repository.mybatis");
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");

        return mapperScannerConfigurer;
    }

}
