package de.codecentric.integration.demo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyPojo {

	private Logger LOG =  LoggerFactory.getLogger(MyPojo.class);
	
	public void foo(String payload) {
		LOG.info("Hello " + payload + "!");
	}
}
