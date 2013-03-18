
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetCurrentGroupOrderIDResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:int" name="GetCurrentGroupOrderIDResult" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class CurrentGroupOrderID
{
    private int getCurrentGroupOrderIDResult;

    /** 
     * Get the 'GetCurrentGroupOrderIDResult' element value.
     * 
     * @return value
     */
    public int getGetCurrentGroupOrderIDResult() {
        return getCurrentGroupOrderIDResult;
    }

    /** 
     * Set the 'GetCurrentGroupOrderIDResult' element value.
     * 
     * @param getCurrentGroupOrderIDResult
     */
    public void setGetCurrentGroupOrderIDResult(int getCurrentGroupOrderIDResult) {
        this.getCurrentGroupOrderIDResult = getCurrentGroupOrderIDResult;
    }
}
