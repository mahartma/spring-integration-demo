
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchdataByTeamsResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfMatchdata" name="GetMatchdataByTeamsResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchdataByTeamsResponse
{
    private ArrayOfMatchdata getMatchdataByTeamsResult;

    /** 
     * Get the 'GetMatchdataByTeamsResult' element value.
     * 
     * @return value
     */
    public ArrayOfMatchdata getGetMatchdataByTeamsResult() {
        return getMatchdataByTeamsResult;
    }

    /** 
     * Set the 'GetMatchdataByTeamsResult' element value.
     * 
     * @param getMatchdataByTeamsResult
     */
    public void setGetMatchdataByTeamsResult(
            ArrayOfMatchdata getMatchdataByTeamsResult) {
        this.getMatchdataByTeamsResult = getMatchdataByTeamsResult;
    }
}
