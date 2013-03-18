
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

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
public class GoalsByMatch
{
    private List<Goal> goalList = new ArrayList<Goal>();

    /** 
     * Get the list of 'Goal' element items.
     * 
     * @return list
     */
    public List<Goal> getGoalList() {
        return goalList;
    }

    /** 
     * Set the list of 'Goal' element items.
     * 
     * @param list
     */
    public void setGoalList(List<Goal> list) {
        goalList = list;
    }
}
