package de.codecentric.integration.demo.handler;

import static org.apache.log4j.Logger.getLogger;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.integration.support.MessageBuilder.withPayload;

import org.apache.log4j.Appender;
import org.apache.log4j.spi.LoggingEvent;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.springframework.integration.Message;


public class MyHandlerTest {

	private MyHandler handler = new MyHandler();
	
	@Mock
	private Appender appenderMock;
	
	@Captor
	private ArgumentCaptor<LoggingEvent> loggingEventCaptor;
	
	@Before
	public void setUp() {
		initMocks(this);
	}
	
	@Test
	public void shouldLogHelloWithPayload() {
		//given
		Message<String> msg = withPayload("test-Message").build();
		getLogger("de.codecentric").addAppender(appenderMock);
		//when
		handler.handleMessage(msg);
		verify(appenderMock).doAppend(loggingEventCaptor.capture());
		//then
		assertThat((String)loggingEventCaptor.getValue().getMessage(), is("Hello test-Message!"));
	}
}
