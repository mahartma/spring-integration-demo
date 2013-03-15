
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetLastMatchByLeagueTeam">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:int" name="leagueId" minOccurs="1" maxOccurs="1"/>
 *       &lt;xs:element type="xs:int" name="teamId" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetLastMatchByLeagueTeam
{
    private int leagueId;
    private int teamId;

    /** 
     * Get the 'leagueId' element value.
     * 
     * @return value
     */
    public int getLeagueId() {
        return leagueId;
    }

    /** 
     * Set the 'leagueId' element value.
     * 
     * @param leagueId
     */
    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    /** 
     * Get the 'teamId' element value.
     * 
     * @return value
     */
    public int getTeamId() {
        return teamId;
    }

    /** 
     * Set the 'teamId' element value.
     * 
     * @param teamId
     */
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
}
