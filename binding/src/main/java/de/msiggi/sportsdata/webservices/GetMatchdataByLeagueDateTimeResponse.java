
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchdataByLeagueDateTimeResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfMatchdata" name="GetMatchdataByLeagueDateTimeResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchdataByLeagueDateTimeResponse
{
    private ArrayOfMatchdata getMatchdataByLeagueDateTimeResult;

    /** 
     * Get the 'GetMatchdataByLeagueDateTimeResult' element value.
     * 
     * @return value
     */
    public ArrayOfMatchdata getGetMatchdataByLeagueDateTimeResult() {
        return getMatchdataByLeagueDateTimeResult;
    }

    /** 
     * Set the 'GetMatchdataByLeagueDateTimeResult' element value.
     * 
     * @param getMatchdataByLeagueDateTimeResult
     */
    public void setGetMatchdataByLeagueDateTimeResult(
            ArrayOfMatchdata getMatchdataByLeagueDateTimeResult) {
        this.getMatchdataByLeagueDateTimeResult = getMatchdataByLeagueDateTimeResult;
    }
}
