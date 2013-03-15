
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetAvailLeaguesResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfLeague" name="GetAvailLeaguesResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetAvailLeaguesResponse
{
    private ArrayOfLeague getAvailLeaguesResult;

    /** 
     * Get the 'GetAvailLeaguesResult' element value.
     * 
     * @return value
     */
    public ArrayOfLeague getGetAvailLeaguesResult() {
        return getAvailLeaguesResult;
    }

    /** 
     * Set the 'GetAvailLeaguesResult' element value.
     * 
     * @param getAvailLeaguesResult
     */
    public void setGetAvailLeaguesResult(ArrayOfLeague getAvailLeaguesResult) {
        this.getAvailLeaguesResult = getAvailLeaguesResult;
    }
}
