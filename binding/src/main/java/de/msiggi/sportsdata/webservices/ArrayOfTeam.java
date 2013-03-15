
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ArrayOfTeam">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:Team" name="Team" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ArrayOfTeam
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
