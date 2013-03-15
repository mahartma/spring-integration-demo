
package de.msiggi.sportsdata.webservices;

import java.util.Date;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchdataByLeagueDateTime">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:dateTime" name="fromDateTime" minOccurs="1" maxOccurs="1"/>
 *       &lt;xs:element type="xs:dateTime" name="toDateTime" minOccurs="1" maxOccurs="1"/>
 *       &lt;xs:element type="xs:string" name="leagueShortcut" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchdataByLeagueDateTime
{
    private Date fromDateTime;
    private Date toDateTime;
    private String leagueShortcut;

    /** 
     * Get the 'fromDateTime' element value.
     * 
     * @return value
     */
    public Date getFromDateTime() {
        return fromDateTime;
    }

    /** 
     * Set the 'fromDateTime' element value.
     * 
     * @param fromDateTime
     */
    public void setFromDateTime(Date fromDateTime) {
        this.fromDateTime = fromDateTime;
    }

    /** 
     * Get the 'toDateTime' element value.
     * 
     * @return value
     */
    public Date getToDateTime() {
        return toDateTime;
    }

    /** 
     * Set the 'toDateTime' element value.
     * 
     * @param toDateTime
     */
    public void setToDateTime(Date toDateTime) {
        this.toDateTime = toDateTime;
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
}
