package de.codecentric.integration.demo;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.integration.Message;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

import de.codecentric.integration.demo.config.IntegrationConfig;


/**
 * the main-app
 * 
 * @author max.hartmann
 *
 */
public class IntegrationMain {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = null;
		try {
			ctx = new AnnotationConfigApplicationContext(IntegrationConfig.class);
			MessageChannel myChannel = ctx.getBean("myChannel", MessageChannel.class);
			Message<?> message = MessageBuilder.withPayload("World").build();
			myChannel.send(message);
		} finally {
			if (ctx != null) {
				ctx.close();
			}
		}
	}
}
