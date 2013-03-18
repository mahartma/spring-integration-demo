
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetCurrentGroupResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:Group" name="GetCurrentGroupResult" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class CurrentGroup
{
    private Group getCurrentGroupResult;

    /** 
     * Get the 'GetCurrentGroupResult' element value.
     * 
     * @return value
     */
    public Group getGetCurrentGroupResult() {
        return getCurrentGroupResult;
    }

    /** 
     * Set the 'GetCurrentGroupResult' element value.
     * 
     * @param getCurrentGroupResult
     */
    public void setGetCurrentGroupResult(Group getCurrentGroupResult) {
        this.getCurrentGroupResult = getCurrentGroupResult;
    }
}
