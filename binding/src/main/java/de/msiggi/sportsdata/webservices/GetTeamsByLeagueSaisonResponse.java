
package de.msiggi.sportsdata.webservices;

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
public class GetTeamsByLeagueSaisonResponse
{
    private ArrayOfTeam getTeamsByLeagueSaisonResult;

    /** 
     * Get the 'GetTeamsByLeagueSaisonResult' element value.
     * 
     * @return value
     */
    public ArrayOfTeam getGetTeamsByLeagueSaisonResult() {
        return getTeamsByLeagueSaisonResult;
    }

    /** 
     * Set the 'GetTeamsByLeagueSaisonResult' element value.
     * 
     * @param getTeamsByLeagueSaisonResult
     */
    public void setGetTeamsByLeagueSaisonResult(
            ArrayOfTeam getTeamsByLeagueSaisonResult) {
        this.getTeamsByLeagueSaisonResult = getTeamsByLeagueSaisonResult;
    }
}
