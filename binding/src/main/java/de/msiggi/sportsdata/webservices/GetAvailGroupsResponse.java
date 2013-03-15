
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetAvailGroupsResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfGroup" name="GetAvailGroupsResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetAvailGroupsResponse
{
    private ArrayOfGroup getAvailGroupsResult;

    /** 
     * Get the 'GetAvailGroupsResult' element value.
     * 
     * @return value
     */
    public ArrayOfGroup getGetAvailGroupsResult() {
        return getAvailGroupsResult;
    }

    /** 
     * Set the 'GetAvailGroupsResult' element value.
     * 
     * @param getAvailGroupsResult
     */
    public void setGetAvailGroupsResult(ArrayOfGroup getAvailGroupsResult) {
        this.getAvailGroupsResult = getAvailGroupsResult;
    }
}
