
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetFusballdatenResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfFussballdaten" name="GetFusballdatenResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetFusballdatenResponse
{
    private ArrayOfFussballdaten getFusballdatenResult;

    /** 
     * Get the 'GetFusballdatenResult' element value.
     * 
     * @return value
     */
    public ArrayOfFussballdaten getGetFusballdatenResult() {
        return getFusballdatenResult;
    }

    /** 
     * Set the 'GetFusballdatenResult' element value.
     * 
     * @param getFusballdatenResult
     */
    public void setGetFusballdatenResult(
            ArrayOfFussballdaten getFusballdatenResult) {
        this.getFusballdatenResult = getFusballdatenResult;
    }
}
