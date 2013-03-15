
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="matchResult">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:string" name="resultname" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="pointsTeam1" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="pointsTeam2" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="resultOrderID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="resultTypeName" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="resultTypeId" minOccurs="1" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class MatchResult
{
    private String resultname;
    private int pointsTeam1;
    private int pointsTeam2;
    private int resultOrderID;
    private String resultTypeName;
    private int resultTypeId;

    /** 
     * Get the 'resultname' element value.
     * 
     * @return value
     */
    public String getResultname() {
        return resultname;
    }

    /** 
     * Set the 'resultname' element value.
     * 
     * @param resultname
     */
    public void setResultname(String resultname) {
        this.resultname = resultname;
    }

    /** 
     * Get the 'pointsTeam1' element value.
     * 
     * @return value
     */
    public int getPointsTeam1() {
        return pointsTeam1;
    }

    /** 
     * Set the 'pointsTeam1' element value.
     * 
     * @param pointsTeam1
     */
    public void setPointsTeam1(int pointsTeam1) {
        this.pointsTeam1 = pointsTeam1;
    }

    /** 
     * Get the 'pointsTeam2' element value.
     * 
     * @return value
     */
    public int getPointsTeam2() {
        return pointsTeam2;
    }

    /** 
     * Set the 'pointsTeam2' element value.
     * 
     * @param pointsTeam2
     */
    public void setPointsTeam2(int pointsTeam2) {
        this.pointsTeam2 = pointsTeam2;
    }

    /** 
     * Get the 'resultOrderID' element value.
     * 
     * @return value
     */
    public int getResultOrderID() {
        return resultOrderID;
    }

    /** 
     * Set the 'resultOrderID' element value.
     * 
     * @param resultOrderID
     */
    public void setResultOrderID(int resultOrderID) {
        this.resultOrderID = resultOrderID;
    }

    /** 
     * Get the 'resultTypeName' element value.
     * 
     * @return value
     */
    public String getResultTypeName() {
        return resultTypeName;
    }

    /** 
     * Set the 'resultTypeName' element value.
     * 
     * @param resultTypeName
     */
    public void setResultTypeName(String resultTypeName) {
        this.resultTypeName = resultTypeName;
    }

    /** 
     * Get the 'resultTypeId' element value.
     * 
     * @return value
     */
    public int getResultTypeId() {
        return resultTypeId;
    }

    /** 
     * Set the 'resultTypeId' element value.
     * 
     * @param resultTypeId
     */
    public void setResultTypeId(int resultTypeId) {
        this.resultTypeId = resultTypeId;
    }
}
