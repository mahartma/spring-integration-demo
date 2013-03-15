
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Group">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="groupName" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="groupOrderID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="groupID" minOccurs="1" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Group
{
    private String groupName;
    private int groupOrderID;
    private int groupID;

    /** 
     * Get the 'groupName' element value.
     * 
     * @return value
     */
    public String getGroupName() {
        return groupName;
    }

    /** 
     * Set the 'groupName' element value.
     * 
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /** 
     * Get the 'groupOrderID' element value.
     * 
     * @return value
     */
    public int getGroupOrderID() {
        return groupOrderID;
    }

    /** 
     * Set the 'groupOrderID' element value.
     * 
     * @param groupOrderID
     */
    public void setGroupOrderID(int groupOrderID) {
        this.groupOrderID = groupOrderID;
    }

    /** 
     * Get the 'groupID' element value.
     * 
     * @return value
     */
    public int getGroupID() {
        return groupID;
    }

    /** 
     * Set the 'groupID' element value.
     * 
     * @param groupID
     */
    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }
}
