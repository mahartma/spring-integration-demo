
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="League">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="leagueID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="leagueSportID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="leagueName" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="leagueShortcut" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="leagueSaison" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class League
{
    private int leagueID;
    private int leagueSportID;
    private String leagueName;
    private String leagueShortcut;
    private String leagueSaison;

    /** 
     * Get the 'leagueID' element value.
     * 
     * @return value
     */
    public int getLeagueID() {
        return leagueID;
    }

    /** 
     * Set the 'leagueID' element value.
     * 
     * @param leagueID
     */
    public void setLeagueID(int leagueID) {
        this.leagueID = leagueID;
    }

    /** 
     * Get the 'leagueSportID' element value.
     * 
     * @return value
     */
    public int getLeagueSportID() {
        return leagueSportID;
    }

    /** 
     * Set the 'leagueSportID' element value.
     * 
     * @param leagueSportID
     */
    public void setLeagueSportID(int leagueSportID) {
        this.leagueSportID = leagueSportID;
    }

    /** 
     * Get the 'leagueName' element value.
     * 
     * @return value
     */
    public String getLeagueName() {
        return leagueName;
    }

    /** 
     * Set the 'leagueName' element value.
     * 
     * @param leagueName
     */
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
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
