package com.test.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * xml配置文件的demo
 * @ClassName:  DubboProviderApplication   
 * @Description:服务提供者启动类  
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.test"})
@ImportResource(locations="classpath:dubbo-provider.xml")
public class DubboProviderApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DubboProviderApplication.class, args); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}