
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Goal">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="goalID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="goalMachID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="goalScoreTeam1" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="goalScoreTeam2" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="goalMatchMinute" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="goalGetterID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="goalGetterName" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:boolean" nillable="true" name="goalPenalty" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:boolean" nillable="true" name="goalOwnGoal" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:boolean" nillable="true" name="goalOvertime" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="goalComment" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Goal
{
    private int goalID;
    private Integer goalMachID;
    private Integer goalScoreTeam1;
    private Integer goalScoreTeam2;
    private Integer goalMatchMinute;
    private int goalGetterID;
    private String goalGetterName;
    private Boolean goalPenalty;
    private Boolean goalOwnGoal;
    private Boolean goalOvertime;
    private String goalComment;

    /** 
     * Get the 'goalID' element value.
     * 
     * @return value
     */
    public int getGoalID() {
        return goalID;
    }

    /** 
     * Set the 'goalID' element value.
     * 
     * @param goalID
     */
    public void setGoalID(int goalID) {
        this.goalID = goalID;
    }

    /** 
     * Get the 'goalMachID' element value.
     * 
     * @return value
     */
    public Integer getGoalMachID() {
        return goalMachID;
    }

    /** 
     * Set the 'goalMachID' element value.
     * 
     * @param goalMachID
     */
    public void setGoalMachID(Integer goalMachID) {
        this.goalMachID = goalMachID;
    }

    /** 
     * Get the 'goalScoreTeam1' element value.
     * 
     * @return value
     */
    public Integer getGoalScoreTeam1() {
        return goalScoreTeam1;
    }

    /** 
     * Set the 'goalScoreTeam1' element value.
     * 
     * @param goalScoreTeam1
     */
    public void setGoalScoreTeam1(Integer goalScoreTeam1) {
        this.goalScoreTeam1 = goalScoreTeam1;
    }

    /** 
     * Get the 'goalScoreTeam2' element value.
     * 
     * @return value
     */
    public Integer getGoalScoreTeam2() {
        return goalScoreTeam2;
    }

    /** 
     * Set the 'goalScoreTeam2' element value.
     * 
     * @param goalScoreTeam2
     */
    public void setGoalScoreTeam2(Integer goalScoreTeam2) {
        this.goalScoreTeam2 = goalScoreTeam2;
    }

    /** 
     * Get the 'goalMatchMinute' element value.
     * 
     * @return value
     */
    public Integer getGoalMatchMinute() {
        return goalMatchMinute;
    }

    /** 
     * Set the 'goalMatchMinute' element value.
     * 
     * @param goalMatchMinute
     */
    public void setGoalMatchMinute(Integer goalMatchMinute) {
        this.goalMatchMinute = goalMatchMinute;
    }

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
     * Get the 'goalPenalty' element value.
     * 
     * @return value
     */
    public Boolean getGoalPenalty() {
        return goalPenalty;
    }

    /** 
     * Set the 'goalPenalty' element value.
     * 
     * @param goalPenalty
     */
    public void setGoalPenalty(Boolean goalPenalty) {
        this.goalPenalty = goalPenalty;
    }

    /** 
     * Get the 'goalOwnGoal' element value.
     * 
     * @return value
     */
    public Boolean getGoalOwnGoal() {
        return goalOwnGoal;
    }

    /** 
     * Set the 'goalOwnGoal' element value.
     * 
     * @param goalOwnGoal
     */
    public void setGoalOwnGoal(Boolean goalOwnGoal) {
        this.goalOwnGoal = goalOwnGoal;
    }

    /** 
     * Get the 'goalOvertime' element value.
     * 
     * @return value
     */
    public Boolean getGoalOvertime() {
        return goalOvertime;
    }

    /** 
     * Set the 'goalOvertime' element value.
     * 
     * @param goalOvertime
     */
    public void setGoalOvertime(Boolean goalOvertime) {
        this.goalOvertime = goalOvertime;
    }

    /** 
     * Get the 'goalComment' element value.
     * 
     * @return value
     */
    public String getGoalComment() {
        return goalComment;
    }

    /** 
     * Set the 'goalComment' element value.
     * 
     * @param goalComment
     */
    public void setGoalComment(String goalComment) {
        this.goalComment = goalComment;
    }
}
