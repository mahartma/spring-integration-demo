package de.msiggi.sportsdata.webservices

import java.text.SimpleDateFormat

import org.custommonkey.xmlunit.XMLAssert;
import org.jibx.runtime.BindingDirectory
import org.jibx.runtime.IBindingFactory
import org.jibx.runtime.IMarshallingContext


class JibXMarshallerTest extends spock.lang.Specification {
	def outputStreamMock = Mock(OutputStream)
	def dateFormatter = new SimpleDateFormat("yyyy-M-d")
	
	def 'should marshal GetAvailLeagues Response to XML'() {
		given:
			AvailLeagues r = new AvailLeagues()
			League l = new League()
			l.leagueName = "Bundesliga"
			r.leagueList << l
			IBindingFactory jc = BindingDirectory.getFactory(AvailLeagues)
			IMarshallingContext marshaller = jc.createMarshallingContext()
			marshaller.setIndent(4)
			def expected = JibXMarshallerTest.getResourceAsStream("GetAvailLeaguesResponse.xml").text
			def current
			1 * outputStreamMock.write( { current = new String(it) }, _, _ )
		when:
			marshaller.marshalDocument(r, "UTF-8", null, outputStreamMock)
		then:
			XMLAssert.assertXMLEqual(expected, current.trim())
	}
	
	def 'should marshal GetNextMatch Response to XML'() {
		given:
			NextMatch r = new NextMatch()
			Matchdata d = new Matchdata()
			d.matchID = 4711
			d.groupID = 4711
			d.groupOrderID = 4711
			d.leagueID = 4711
			d.idTeam1 = 1
			d.idTeam2 = 2
			d.pointsTeam1 = 3
			d.pointsTeam2 = 0
			d.matchIsFinished = true
			d.location = new Location()
			d.matchDateTime = dateFormatter.parse("2011-01-15" )
			d.matchDateTimeUTC = dateFormatter.parse("2011-01-15" )
			d.lastUpdate = dateFormatter.parse("2011-01-15" )
			d.leagueName = "Bundesliga"
			d.numberOfViewers = 2423 
			r.setGetnextMatchResult(d);
			IBindingFactory jc = BindingDirectory.getFactory(NextMatch)
			IMarshallingContext marshaller = jc.createMarshallingContext()
			marshaller.setIndent(4)
			def expected = JibXMarshallerTest.getResourceAsStream("GetnextMatchResponse.xml").text
			def current
			1 * outputStreamMock.write( { current = new String(it) }, _, _ )
		when:
			marshaller.marshalDocument(r, "UTF-8", null, outputStreamMock)
		then:
			XMLAssert.assertXMLEqual(expected, current.trim())
	}
}