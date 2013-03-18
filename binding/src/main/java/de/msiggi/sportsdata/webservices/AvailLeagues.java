
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetAvailLeaguesResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfLeague" name="GetAvailLeaguesResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class AvailLeagues
{
    private List<League> leagueList = new ArrayList<League>();

	/**
	 * @return the leagueList
	 */
	public List<League> getLeagueList() {
		return leagueList;
	}

	/**
	 * @param leagueList the leagueList to set
	 */
	public void setLeagueList(List<League> leagueList) {
		this.leagueList = leagueList;
	}
}
