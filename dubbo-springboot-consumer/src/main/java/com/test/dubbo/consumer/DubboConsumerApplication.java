package com.test.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * xml配置文件的demo
 * @ClassName:  DubboConsumerApplication   
 * @Description:消费者
 *
 */
@SpringBootApplication
@ComponentScan(basePackages={"com.test"})
@ImportResource(locations = "classpath:dubbo-consumer.xml")
public class DubboConsumerApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DubboConsumerApplication.class, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}