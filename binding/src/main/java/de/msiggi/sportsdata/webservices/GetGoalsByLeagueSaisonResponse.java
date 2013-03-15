
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetGoalsByLeagueSaisonResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfGoal" name="GetGoalsByLeagueSaisonResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetGoalsByLeagueSaisonResponse
{
    private ArrayOfGoal getGoalsByLeagueSaisonResult;

    /** 
     * Get the 'GetGoalsByLeagueSaisonResult' element value.
     * 
     * @return value
     */
    public ArrayOfGoal getGetGoalsByLeagueSaisonResult() {
        return getGoalsByLeagueSaisonResult;
    }

    /** 
     * Set the 'GetGoalsByLeagueSaisonResult' element value.
     * 
     * @param getGoalsByLeagueSaisonResult
     */
    public void setGetGoalsByLeagueSaisonResult(
            ArrayOfGoal getGoalsByLeagueSaisonResult) {
        this.getGoalsByLeagueSaisonResult = getGoalsByLeagueSaisonResult;
    }
}
