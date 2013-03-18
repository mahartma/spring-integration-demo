
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetLastMatchByLeagueTeamResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:Matchdata" name="GetLastMatchByLeagueTeamResult" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class LastMatchByLeagueTeam
{
    private Matchdata getLastMatchByLeagueTeamResult;

    /** 
     * Get the 'GetLastMatchByLeagueTeamResult' element value.
     * 
     * @return value
     */
    public Matchdata getGetLastMatchByLeagueTeamResult() {
        return getLastMatchByLeagueTeamResult;
    }

    /** 
     * Set the 'GetLastMatchByLeagueTeamResult' element value.
     * 
     * @param getLastMatchByLeagueTeamResult
     */
    public void setGetLastMatchByLeagueTeamResult(
            Matchdata getLastMatchByLeagueTeamResult) {
        this.getLastMatchByLeagueTeamResult = getLastMatchByLeagueTeamResult;
    }
}
