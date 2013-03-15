
package de.msiggi.sportsdata.webservices;

import java.util.Date;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GoalGetter">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="goalGetterID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="goalGetterName" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="goalGetterNationality" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:dateTime" nillable="true" name="goalGetterBirthday" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="goalGetterGoalCount" minOccurs="1" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class GoalGetter
{
    private int goalGetterID;
    private String goalGetterName;
    private String goalGetterNationality;
    private Date goalGetterBirthday;
    private Integer goalGetterGoalCount;

    /** 
     * Get the 'goalGetterID' element value.
     * 
     * @return value
     */
    public int getGoalGetterID() {
        return goalGetterID;
    }

    /** 
     * Set the 'goalGetterID' element value.
     * 
     * @param goalGetterID
     */
    public void setGoalGetterID(int goalGetterID) {
        this.goalGetterID = goalGetterID;
    }

    /** 
     * Get the 'goalGetterName' element value.
     * 
     * @return value
     */
    public String getGoalGetterName() {
        return goalGetterName;
    }

    /** 
     * Set the 'goalGetterName' element value.
     * 
     * @param goalGetterName
     */
    public void setGoalGetterName(String goalGetterName) {
        this.goalGetterName = goalGetterName;
    }

    /** 
     * Get the 'goalGetterNationality' element value.
     * 
     * @return value
     */
    public String getGoalGetterNationality() {
        return goalGetterNationality;
    }

    /** 
     * Set the 'goalGetterNationality' element value.
     * 
     * @param goalGetterNationality
     */
    public void setGoalGetterNationality(String goalGetterNationality) {
        this.goalGetterNationality = goalGetterNationality;
    }

    /** 
     * Get the 'goalGetterBirthday' element value.
     * 
     * @return value
     */
    public Date getGoalGetterBirthday() {
        return goalGetterBirthday;
    }

    /** 
     * Set the 'goalGetterBirthday' element value.
     * 
     * @param goalGetterBirthday
     */
    public void setGoalGetterBirthday(Date goalGetterBirthday) {
        this.goalGetterBirthday = goalGetterBirthday;
    }

    /** 
     * Get the 'goalGetterGoalCount' element value.
     * 
     * @return value
     */
    public Integer getGoalGetterGoalCount() {
        return goalGetterGoalCount;
    }

    /** 
     * Set the 'goalGetterGoalCount' element value.
     * 
     * @param goalGetterGoalCount
     */
    public void setGoalGetterGoalCount(Integer goalGetterGoalCount) {
        this.goalGetterGoalCount = goalGetterGoalCount;
    }
}
