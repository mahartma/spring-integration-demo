
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ArrayOfSport">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:Sport" nillable="true" name="Sport" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ArrayOfSport
{
    private List<Sport> sportList = new ArrayList<Sport>();

    /** 
     * Get the list of 'Sport' element items.
     * 
     * @return list
     */
    public List<Sport> getSportList() {
        return sportList;
    }

    /** 
     * Set the list of 'Sport' element items.
     * 
     * @param list
     */
    public void setSportList(List<Sport> list) {
        sportList = list;
    }
}
