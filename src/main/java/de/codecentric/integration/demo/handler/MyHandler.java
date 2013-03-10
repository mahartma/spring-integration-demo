package de.codecentric.integration.demo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.integration.Message;
import org.springframework.integration.core.MessageHandler;

public class MyHandler implements MessageHandler {

	private static Logger LOG =  LoggerFactory.getLogger(MyHandler.class);
	
	public void handleMessage(Message<?> message) {
		LOG.info("Hello " + message.getPayload() + "!");
	}
}
