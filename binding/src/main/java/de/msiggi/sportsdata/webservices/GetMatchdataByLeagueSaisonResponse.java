
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchdataByLeagueSaisonResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfMatchdata" name="GetMatchdataByLeagueSaisonResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchdataByLeagueSaisonResponse
{
    private ArrayOfMatchdata getMatchdataByLeagueSaisonResult;

    /** 
     * Get the 'GetMatchdataByLeagueSaisonResult' element value.
     * 
     * @return value
     */
    public ArrayOfMatchdata getGetMatchdataByLeagueSaisonResult() {
        return getMatchdataByLeagueSaisonResult;
    }

    /** 
     * Set the 'GetMatchdataByLeagueSaisonResult' element value.
     * 
     * @param getMatchdataByLeagueSaisonResult
     */
    public void setGetMatchdataByLeagueSaisonResult(
            ArrayOfMatchdata getMatchdataByLeagueSaisonResult) {
        this.getMatchdataByLeagueSaisonResult = getMatchdataByLeagueSaisonResult;
    }
}
