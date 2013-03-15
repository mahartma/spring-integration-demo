
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ArrayOfGoal">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:Goal" name="Goal" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ArrayOfGoal
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
