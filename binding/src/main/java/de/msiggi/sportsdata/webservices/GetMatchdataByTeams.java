
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchdataByTeams">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:int" name="teamID1" minOccurs="1" maxOccurs="1"/>
 *       &lt;xs:element type="xs:int" name="teamID2" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchdataByTeams
{
    private int teamID1;
    private int teamID2;

    /** 
     * Get the 'teamID1' element value.
     * 
     * @return value
     */
    public int getTeamID1() {
        return teamID1;
    }

    /** 
     * Set the 'teamID1' element value.
     * 
     * @param teamID1
     */
    public void setTeamID1(int teamID1) {
        this.teamID1 = teamID1;
    }

    /** 
     * Get the 'teamID2' element value.
     * 
     * @return value
     */
    public int getTeamID2() {
        return teamID2;
    }

    /** 
     * Set the 'teamID2' element value.
     * 
     * @param teamID2
     */
    public void setTeamID2(int teamID2) {
        this.teamID2 = teamID2;
    }
}
