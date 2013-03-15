
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetGoalsByMatchResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfGoal" name="GetGoalsByMatchResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetGoalsByMatchResponse
{
    private ArrayOfGoal getGoalsByMatchResult;

    /** 
     * Get the 'GetGoalsByMatchResult' element value.
     * 
     * @return value
     */
    public ArrayOfGoal getGetGoalsByMatchResult() {
        return getGoalsByMatchResult;
    }

    /** 
     * Set the 'GetGoalsByMatchResult' element value.
     * 
     * @param getGoalsByMatchResult
     */
    public void setGetGoalsByMatchResult(ArrayOfGoal getGoalsByMatchResult) {
        this.getGoalsByMatchResult = getGoalsByMatchResult;
    }
}
