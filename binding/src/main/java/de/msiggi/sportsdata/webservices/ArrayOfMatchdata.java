
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ArrayOfMatchdata">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:Matchdata" name="Matchdata" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ArrayOfMatchdata
{
    private List<Matchdata> matchdataList = new ArrayList<Matchdata>();

    /** 
     * Get the list of 'Matchdata' element items.
     * 
     * @return list
     */
    public List<Matchdata> getMatchdataList() {
        return matchdataList;
    }

    /** 
     * Set the list of 'Matchdata' element items.
     * 
     * @param list
     */
    public void setMatchdataList(List<Matchdata> list) {
        matchdataList = list;
    }
}
