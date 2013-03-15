
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetAvailSportsResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfSport" name="GetAvailSportsResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetAvailSportsResponse
{
    private ArrayOfSport getAvailSportsResult;

    /** 
     * Get the 'GetAvailSportsResult' element value.
     * 
     * @return value
     */
    public ArrayOfSport getGetAvailSportsResult() {
        return getAvailSportsResult;
    }

    /** 
     * Set the 'GetAvailSportsResult' element value.
     * 
     * @param getAvailSportsResult
     */
    public void setGetAvailSportsResult(ArrayOfSport getAvailSportsResult) {
        this.getAvailSportsResult = getAvailSportsResult;
    }
}
