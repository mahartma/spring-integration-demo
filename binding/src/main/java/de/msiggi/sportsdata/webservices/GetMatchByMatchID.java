
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetMatchByMatchID">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:int" name="MatchID" minOccurs="1" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetMatchByMatchID
{
    private int matchID;

    /** 
     * Get the 'MatchID' element value.
     * 
     * @return value
     */
    public int getMatchID() {
        return matchID;
    }

    /** 
     * Set the 'MatchID' element value.
     * 
     * @param matchID
     */
    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }
}
