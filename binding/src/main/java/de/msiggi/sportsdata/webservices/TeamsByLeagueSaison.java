
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetTeamsByLeagueSaisonResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfTeam" name="GetTeamsByLeagueSaisonResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class TeamsByLeagueSaison
{
	  private List<Team> teamList = new ArrayList<Team>();

	    /** 
	     * Get the list of 'Team' element items.
	     * 
	     * @return list
	     */
	    public List<Team> getTeamList() {
	        return teamList;
	    }

	    /** 
	     * Set the list of 'Team' element items.
	     * 
	     * @param list
	     */
	    public void setTeamList(List<Team> list) {
	        teamList = list;
	    }
}
