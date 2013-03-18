
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetAvailLeaguesBySportsResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfLeague" name="GetAvailLeaguesBySportsResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class AvailLeaguesBySports
{
    private List<League> leagueList = new ArrayList<League>();

    /** 
     * Get the list of 'League' element items.
     * 
     * @return list
     */
    public List<League> getLeagueList() {
        return leagueList;
    }

    /** 
     * Set the list of 'League' element items.
     * 
     * @param list
     */
    public void setLeagueList(List<League> list) {
        leagueList = list;
    }
}
