
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchdataByGroupLeagueSaisonResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfMatchdata" name="GetMatchdataByGroupLeagueSaisonResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class MatchdataByGroupLeagueSaison
{
	private List<Matchdata> matchdataList = new ArrayList<Matchdata>();

	/**
	 * @return the matchdataList
	 */
	public List<Matchdata> getMatchdataList() {
		return matchdataList;
	}

	/**
	 * @param matchdataList the matchdataList to set
	 */
	public void setMatchdataList(List<Matchdata> matchdataList) {
		this.matchdataList = matchdataList;
	}

}
