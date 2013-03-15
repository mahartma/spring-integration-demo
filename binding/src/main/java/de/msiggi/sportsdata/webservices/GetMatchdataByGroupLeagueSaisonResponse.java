
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchdataByGroupLeagueSaisonResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfMatchdata" name="GetMatchdataByGroupLeagueSaisonResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchdataByGroupLeagueSaisonResponse
{
    private ArrayOfMatchdata getMatchdataByGroupLeagueSaisonResult;

    /** 
     * Get the 'GetMatchdataByGroupLeagueSaisonResult' element value.
     * 
     * @return value
     */
    public ArrayOfMatchdata getGetMatchdataByGroupLeagueSaisonResult() {
        return getMatchdataByGroupLeagueSaisonResult;
    }

    /** 
     * Set the 'GetMatchdataByGroupLeagueSaisonResult' element value.
     * 
     * @param getMatchdataByGroupLeagueSaisonResult
     */
    public void setGetMatchdataByGroupLeagueSaisonResult(
            ArrayOfMatchdata getMatchdataByGroupLeagueSaisonResult) {
        this.getMatchdataByGroupLeagueSaisonResult = getMatchdataByGroupLeagueSaisonResult;
    }
}
