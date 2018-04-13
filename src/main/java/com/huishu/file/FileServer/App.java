package com.huishu.file.FileServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目启动
 * 
 * @author yindq
 * @date 2017年11月8日
 */
@EnableAutoConfiguration  
@ComponentScan 
public class App extends SpringBootServletInitializer {
    public static void main( String[] args )  
    {  
        SpringApplication.run(App.class, args);  
    }  
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}
}  
