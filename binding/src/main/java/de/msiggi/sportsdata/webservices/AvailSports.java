
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetAvailSportsResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfSport" name="GetAvailSportsResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class AvailSports
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
