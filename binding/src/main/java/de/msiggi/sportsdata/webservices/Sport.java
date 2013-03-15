
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Sport">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="sportsID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="sportsName" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Sport
{
    private int sportsID;
    private String sportsName;

    /** 
     * Get the 'sportsID' element value.
     * 
     * @return value
     */
    public int getSportsID() {
        return sportsID;
    }

    /** 
     * Set the 'sportsID' element value.
     * 
     * @param sportsID
     */
    public void setSportsID(int sportsID) {
        this.sportsID = sportsID;
    }

    /** 
     * Get the 'sportsName' element value.
     * 
     * @return value
     */
    public String getSportsName() {
        return sportsName;
    }

    /** 
     * Set the 'sportsName' element value.
     * 
     * @param sportsName
     */
    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }
}
