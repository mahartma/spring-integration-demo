
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ArrayOfMatchResult">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:matchResult" name="matchResult" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ArrayOfMatchResult
{
    private List<MatchResult> matchResultList = new ArrayList<MatchResult>();

    /** 
     * Get the list of 'matchResult' element items.
     * 
     * @return list
     */
    public List<MatchResult> getMatchResultList() {
        return matchResultList;
    }

    /** 
     * Set the list of 'matchResult' element items.
     * 
     * @param list
     */
    public void setMatchResultList(List<MatchResult> list) {
        matchResultList = list;
    }
}
