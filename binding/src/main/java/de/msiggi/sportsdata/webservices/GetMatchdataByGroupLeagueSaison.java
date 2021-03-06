
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchdataByGroupLeagueSaison">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:int" name="groupOrderID" minOccurs="1" maxOccurs="1"/>
 *       &lt;xs:element type="xs:string" name="leagueShortcut" minOccurs="0" maxOccurs="1"/>
 *       &lt;xs:element type="xs:string" name="leagueSaison" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchdataByGroupLeagueSaison
{
    private int groupOrderID;
    private String leagueShortcut;
    private String leagueSaison;

    /** 
     * Get the 'groupOrderID' element value.
     * 
     * @return value
     */
    public int getGroupOrderID() {
        return groupOrderID;
    }

    /** 
     * Set the 'groupOrderID' element value.
     * 
     * @param groupOrderID
     */
    public void setGroupOrderID(int groupOrderID) {
        this.groupOrderID = groupOrderID;
    }

    /** 
     * Get the 'leagueShortcut' element value.
     * 
     * @return value
     */
    public String getLeagueShortcut() {
        return leagueShortcut;
    }

    /** 
     * Set the 'leagueShortcut' element value.
     * 
     * @param leagueShortcut
     */
    public void setLeagueShortcut(String leagueShortcut) {
        this.leagueShortcut = leagueShortcut;
    }

    /** 
     * Get the 'leagueSaison' element value.
     * 
     * @return value
     */
    public String getLeagueSaison() {
        return leagueSaison;
    }

    /** 
     * Set the 'leagueSaison' element value.
     * 
     * @param leagueSaison
     */
    public void setLeagueSaison(String leagueSaison) {
        this.leagueSaison = leagueSaison;
    }
}
