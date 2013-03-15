
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetnextMatchResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:Matchdata" name="GetnextMatchResult" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetnextMatchResponse
{
    private Matchdata getnextMatchResult;

    /** 
     * Get the 'GetnextMatchResult' element value.
     * 
     * @return value
     */
    public Matchdata getGetnextMatchResult() {
        return getnextMatchResult;
    }

    /** 
     * Set the 'GetnextMatchResult' element value.
     * 
     * @param getnextMatchResult
     */
    public void setGetnextMatchResult(Matchdata getnextMatchResult) {
        this.getnextMatchResult = getnextMatchResult;
    }
}
