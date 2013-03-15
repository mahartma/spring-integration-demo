
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="ArrayOfGroup">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="ns:Group" name="Group" minOccurs="0" maxOccurs="unbounded"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class ArrayOfGroup
{
    private List<Group> groupList = new ArrayList<Group>();

    /** 
     * Get the list of 'Group' element items.
     * 
     * @return list
     */
    public List<Group> getGroupList() {
        return groupList;
    }

    /** 
     * Set the list of 'Group' element items.
     * 
     * @param list
     */
    public void setGroupList(List<Group> list) {
        groupList = list;
    }
}
