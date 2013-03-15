
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetnextMatchByLeagueTeamResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:Matchdata" name="GetnextMatchByLeagueTeamResult" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetnextMatchByLeagueTeamResponse
{
    private Matchdata getnextMatchByLeagueTeamResult;

    /** 
     * Get the 'GetnextMatchByLeagueTeamResult' element value.
     * 
     * @return value
     */
    public Matchdata getGetnextMatchByLeagueTeamResult() {
        return getnextMatchByLeagueTeamResult;
    }

    /** 
     * Set the 'GetnextMatchByLeagueTeamResult' element value.
     * 
     * @param getnextMatchByLeagueTeamResult
     */
    public void setGetnextMatchByLeagueTeamResult(
            Matchdata getnextMatchByLeagueTeamResult) {
        this.getnextMatchByLeagueTeamResult = getnextMatchByLeagueTeamResult;
    }
}
