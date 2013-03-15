
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Team">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="teamID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="teamName" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="teamIconURL" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Team
{
    private int teamID;
    private String teamName;
    private String teamIconURL;

    /** 
     * Get the 'teamID' element value.
     * 
     * @return value
     */
    public int getTeamID() {
        return teamID;
    }

    /** 
     * Set the 'teamID' element value.
     * 
     * @param teamID
     */
    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    /** 
     * Get the 'teamName' element value.
     * 
     * @return value
     */
    public String getTeamName() {
        return teamName;
    }

    /** 
     * Set the 'teamName' element value.
     * 
     * @param teamName
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /** 
     * Get the 'teamIconURL' element value.
     * 
     * @return value
     */
    public String getTeamIconURL() {
        return teamIconURL;
    }

    /** 
     * Set the 'teamIconURL' element value.
     * 
     * @param teamIconURL
     */
    public void setTeamIconURL(String teamIconURL) {
        this.teamIconURL = teamIconURL;
    }
}
