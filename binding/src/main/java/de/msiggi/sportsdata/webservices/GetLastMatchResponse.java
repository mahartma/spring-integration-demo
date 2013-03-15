
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetLastMatchResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:Matchdata" name="GetLastMatchResult" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetLastMatchResponse
{
    private Matchdata getLastMatchResult;

    /** 
     * Get the 'GetLastMatchResult' element value.
     * 
     * @return value
     */
    public Matchdata getGetLastMatchResult() {
        return getLastMatchResult;
    }

    /** 
     * Set the 'GetLastMatchResult' element value.
     * 
     * @param getLastMatchResult
     */
    public void setGetLastMatchResult(Matchdata getLastMatchResult) {
        this.getLastMatchResult = getLastMatchResult;
    }
}
