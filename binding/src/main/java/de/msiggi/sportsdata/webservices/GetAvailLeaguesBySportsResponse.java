
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetAvailLeaguesBySportsResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfLeague" name="GetAvailLeaguesBySportsResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetAvailLeaguesBySportsResponse
{
    private ArrayOfLeague getAvailLeaguesBySportsResult;

    /** 
     * Get the 'GetAvailLeaguesBySportsResult' element value.
     * 
     * @return value
     */
    public ArrayOfLeague getGetAvailLeaguesBySportsResult() {
        return getAvailLeaguesBySportsResult;
    }

    /** 
     * Set the 'GetAvailLeaguesBySportsResult' element value.
     * 
     * @param getAvailLeaguesBySportsResult
     */
    public void setGetAvailLeaguesBySportsResult(
            ArrayOfLeague getAvailLeaguesBySportsResult) {
        this.getAvailLeaguesBySportsResult = getAvailLeaguesBySportsResult;
    }
}
