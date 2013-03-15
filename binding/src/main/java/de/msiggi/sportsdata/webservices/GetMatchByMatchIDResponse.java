
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchByMatchIDResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:Matchdata" name="GetMatchByMatchIDResult" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchByMatchIDResponse
{
    private Matchdata getMatchByMatchIDResult;

    /** 
     * Get the 'GetMatchByMatchIDResult' element value.
     * 
     * @return value
     */
    public Matchdata getGetMatchByMatchIDResult() {
        return getMatchByMatchIDResult;
    }

    /** 
     * Set the 'GetMatchByMatchIDResult' element value.
     * 
     * @param getMatchByMatchIDResult
     */
    public void setGetMatchByMatchIDResult(Matchdata getMatchByMatchIDResult) {
        this.getMatchByMatchIDResult = getMatchByMatchIDResult;
    }
}
