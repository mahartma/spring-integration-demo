
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetAvailLeaguesBySports">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:int" name="sportID" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetAvailLeaguesBySports
{
    private int sportID;

    /** 
     * Get the 'sportID' element value.
     * 
     * @return value
     */
    public int getSportID() {
        return sportID;
    }

    /** 
     * Set the 'sportID' element value.
     * 
     * @param sportID
     */
    public void setSportID(int sportID) {
        this.sportID = sportID;
    }
}
