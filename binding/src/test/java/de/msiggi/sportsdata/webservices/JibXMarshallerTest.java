package de.msiggi.sportsdata.webservices;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import org.apache.commons.io.IOUtils;
import org.jibx.runtime.BindingDirectory;
import org.jibx.runtime.IBindingFactory;
import org.jibx.runtime.IMarshallingContext;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;

public class JibXMarshallerTest {
	
	@Mock
	private OutputStream outputStreamMock;
	
	@Captor
	private ArgumentCaptor<byte[]> captor;

	@Before
	public void setUp() {
		initMocks(this);
	}
	
	@Test
	public void shouldMarshalGetAvailLeaguesResponse() throws Exception {
		//given
		AvailLeagues r = new AvailLeagues();
		r.setLeagueList(new ArrayList<League>());
		League l = new League();
		l.setLeagueName("Bundesliga");
		r.getLeagueList().add(l);
		IBindingFactory jc = BindingDirectory.getFactory(AvailLeagues.class);
		IMarshallingContext marshaller = jc.createMarshallingContext();
		marshaller.setIndent(4);
		InputStream stream = JibXMarshallerTest.class.getResourceAsStream("GetAvailLeaguesResponse.xml");
		String expected = IOUtils.toString(stream);
		//when
		marshaller.marshalDocument(r, "UTF-8", null, outputStreamMock);
		verify(outputStreamMock).write(captor.capture(), any(int.class), any(int.class));
		//then
		assertThat(expected, is(new String(captor.getValue()).trim()));
		
	}
}
