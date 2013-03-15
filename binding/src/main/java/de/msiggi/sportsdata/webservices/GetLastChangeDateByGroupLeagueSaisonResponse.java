
package de.msiggi.sportsdata.webservices;

import java.util.Date;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetLastChangeDateByGroupLeagueSaisonResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:dateTime" name="GetLastChangeDateByGroupLeagueSaisonResult" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetLastChangeDateByGroupLeagueSaisonResponse
{
    private Date getLastChangeDateByGroupLeagueSaisonResult;

    /** 
     * Get the 'GetLastChangeDateByGroupLeagueSaisonResult' element value.
     * 
     * @return value
     */
    public Date getGetLastChangeDateByGroupLeagueSaisonResult() {
        return getLastChangeDateByGroupLeagueSaisonResult;
    }

    /** 
     * Set the 'GetLastChangeDateByGroupLeagueSaisonResult' element value.
     * 
     * @param getLastChangeDateByGroupLeagueSaisonResult
     */
    public void setGetLastChangeDateByGroupLeagueSaisonResult(
            Date getLastChangeDateByGroupLeagueSaisonResult) {
        this.getLastChangeDateByGroupLeagueSaisonResult = getLastChangeDateByGroupLeagueSaisonResult;
    }
}
