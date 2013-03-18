
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetGoalGettersByLeagueSaisonResponse">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="ns:ArrayOfGoalGetter" name="GetGoalGettersByLeagueSaisonResult" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GoalGettersByLeagueSaison
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
