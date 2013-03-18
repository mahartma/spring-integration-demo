
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

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
public class Fusballdaten
{
    private List<Fussballdaten> fussballdatenList = new ArrayList<Fussballdaten>();

    /** 
     * Get the list of 'Fussballdaten' element items.
     * 
     * @return list
     */
    public List<Fussballdaten> getFussballdatenList() {
        return fussballdatenList;
    }

    /** 
     * Set the list of 'Fussballdaten' element items.
     * 
     * @param list
     */
    public void setFussballdatenList(List<Fussballdaten> list) {
        fussballdatenList = list;
    }
}
