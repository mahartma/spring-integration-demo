package de.codecentric.integration.demo.handler

import org.apache.log4j.Appender
import org.apache.log4j.Logger
import org.apache.log4j.spi.LoggingEvent
import static org.hamcrest.CoreMatchers.is
import static org.junit.Assert.assertThat
import org.springframework.integration.Message
import org.springframework.integration.support.MessageBuilder
import de.codecentric.integration.demo.handler.MyHandler


class MyHandlerTest extends spock.lang.Specification {

	def handler = new MyHandler()
	
	def appenderMock = Mock(Appender)
	
	def shouldLogHelloWithPayload() {
		given:
			Message<String> msg = MessageBuilder.withPayload("test-Message").build();
			Logger.getLogger("de.codecentric").addAppender(appenderMock);
		when:
			def logMessage
			1 * appenderMock.doAppend({logMessage = it})
			handler.handleMessage(msg);
		then:
			assertThat((String)logMessage.getMessage(), is("Hello test-Message!"));
	}
}
