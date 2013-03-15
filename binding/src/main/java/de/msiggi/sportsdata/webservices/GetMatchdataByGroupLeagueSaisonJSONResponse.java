
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchdataByGroupLeagueSaisonJSONResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:string" name="GetMatchdataByGroupLeagueSaisonJSONResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchdataByGroupLeagueSaisonJSONResponse
{
    private String getMatchdataByGroupLeagueSaisonJSONResult;

    /** 
     * Get the 'GetMatchdataByGroupLeagueSaisonJSONResult' element value.
     * 
     * @return value
     */
    public String getGetMatchdataByGroupLeagueSaisonJSONResult() {
        return getMatchdataByGroupLeagueSaisonJSONResult;
    }

    /** 
     * Set the 'GetMatchdataByGroupLeagueSaisonJSONResult' element value.
     * 
     * @param getMatchdataByGroupLeagueSaisonJSONResult
     */
    public void setGetMatchdataByGroupLeagueSaisonJSONResult(
            String getMatchdataByGroupLeagueSaisonJSONResult) {
        this.getMatchdataByGroupLeagueSaisonJSONResult = getMatchdataByGroupLeagueSaisonJSONResult;
    }
}
