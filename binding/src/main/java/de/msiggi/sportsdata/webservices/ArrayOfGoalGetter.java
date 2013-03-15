
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ArrayOfGoalGetter">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:GoalGetter" name="GoalGetter" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ArrayOfGoalGetter
{
    private List<GoalGetter> goalGetterList = new ArrayList<GoalGetter>();

    /** 
     * Get the list of 'GoalGetter' element items.
     * 
     * @return list
     */
    public List<GoalGetter> getGoalGetterList() {
        return goalGetterList;
    }

    /** 
     * Set the list of 'GoalGetter' element items.
     * 
     * @param list
     */
    public void setGoalGetterList(List<GoalGetter> list) {
        goalGetterList = list;
    }
}
