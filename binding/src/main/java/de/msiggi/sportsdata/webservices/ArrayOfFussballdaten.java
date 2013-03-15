
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ArrayOfFussballdaten">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:Fussballdaten" name="Fussballdaten" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ArrayOfFussballdaten
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
