
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetNextMatch">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:string" name="leagueShortcut" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetNextMatch
{
    private String leagueShortcut;

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
}
