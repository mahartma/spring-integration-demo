package de.codecentric.integration.demo.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.core.SubscribableChannel;

import de.codecentric.integration.demo.handler.MyHandler;
import de.codecentric.integration.demo.handler.MyPojo;

/**
 *  Spring-Configuration for the Integration-Demo
 */
@Configuration
@ImportResource("classpath:*-context.xml")
public class IntegrationConfig {

	@Autowired 
	@Qualifier("myChannel")
	private SubscribableChannel myChannel;
	
	@Bean
	public MyHandler myHandler() {
		MyHandler myHandler = new MyHandler();
		myChannel.subscribe(myHandler);
		return myHandler;
	}
	
	@Bean
	public MyPojo myPojo() {
		return new MyPojo();
	}
}
