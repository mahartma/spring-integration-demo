
package de.msiggi.sportsdata.webservices;

import java.util.Date;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetLastChangeDateByLeagueSaisonResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:dateTime" name="GetLastChangeDateByLeagueSaisonResult" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class LastChangeDateByLeagueSaison
{
    private Date getLastChangeDateByLeagueSaisonResult;

    /** 
     * Get the 'GetLastChangeDateByLeagueSaisonResult' element value.
     * 
     * @return value
     */
    public Date getGetLastChangeDateByLeagueSaisonResult() {
        return getLastChangeDateByLeagueSaisonResult;
    }

    /** 
     * Set the 'GetLastChangeDateByLeagueSaisonResult' element value.
     * 
     * @param getLastChangeDateByLeagueSaisonResult
     */
    public void setGetLastChangeDateByLeagueSaisonResult(
            Date getLastChangeDateByLeagueSaisonResult) {
        this.getLastChangeDateByLeagueSaisonResult = getLastChangeDateByLeagueSaisonResult;
    }
}
