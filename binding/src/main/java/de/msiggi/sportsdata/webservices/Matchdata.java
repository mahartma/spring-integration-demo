
package de.msiggi.sportsdata.webservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Matchdata">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="matchID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:dateTime" name="matchDateTime" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="TimeZoneID" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:dateTime" name="matchDateTimeUTC" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="groupID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="groupOrderID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="groupName" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="leagueID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="leagueName" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="leagueSaison" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="leagueShortcut" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="nameTeam1" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="nameTeam2" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="idTeam1" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="idTeam2" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="iconUrlTeam1" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="iconUrlTeam2" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="pointsTeam1" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="pointsTeam2" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:dateTime" name="lastUpdate" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:boolean" name="matchIsFinished" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="ns:ArrayOfMatchResult" name="matchResults" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="ns:ArrayOfGoal" name="goals" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="ns:Location" name="location" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" nillable="true" name="NumberOfViewers" minOccurs="1" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Matchdata
{
    private int matchID;
    private Date matchDateTime;
    private String timeZoneID;
    private Date matchDateTimeUTC;
    private int groupID;
    private int groupOrderID;
    private String groupName;
    private int leagueID;
    private String leagueName;
    private String leagueSaison;
    private String leagueShortcut;
    private String nameTeam1;
    private String nameTeam2;
    private int idTeam1;
    private int idTeam2;
    private String iconUrlTeam1;
    private String iconUrlTeam2;
    private int pointsTeam1;
    private int pointsTeam2;
    private Date lastUpdate;
    private boolean matchIsFinished;
    private List<MatchResult> matchResultList = new ArrayList<MatchResult>();
    private List<Goal> goalList = new ArrayList<Goal>();
    private Location location;
    private Integer numberOfViewers;

    /** 
     * Get the 'matchID' element value.
     * 
     * @return value
     */
    public int getMatchID() {
        return matchID;
    }

    /** 
     * Set the 'matchID' element value.
     * 
     * @param matchID
     */
    public void setMatchID(int matchID) {
        this.matchID = matchID;
    }

    /** 
     * Get the 'matchDateTime' element value.
     * 
     * @return value
     */
    public Date getMatchDateTime() {
        return matchDateTime;
    }

    /** 
     * Set the 'matchDateTime' element value.
     * 
     * @param matchDateTime
     */
    public void setMatchDateTime(Date matchDateTime) {
        this.matchDateTime = matchDateTime;
    }

    /** 
     * Get the 'TimeZoneID' element value.
     * 
     * @return value
     */
    public String getTimeZoneID() {
        return timeZoneID;
    }

    /** 
     * Set the 'TimeZoneID' element value.
     * 
     * @param timeZoneID
     */
    public void setTimeZoneID(String timeZoneID) {
        this.timeZoneID = timeZoneID;
    }

    /** 
     * Get the 'matchDateTimeUTC' element value.
     * 
     * @return value
     */
    public Date getMatchDateTimeUTC() {
        return matchDateTimeUTC;
    }

    /** 
     * Set the 'matchDateTimeUTC' element value.
     * 
     * @param matchDateTimeUTC
     */
    public void setMatchDateTimeUTC(Date matchDateTimeUTC) {
        this.matchDateTimeUTC = matchDateTimeUTC;
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
     * Get the 'leagueID' element value.
     * 
     * @return value
     */
    public int getLeagueID() {
        return leagueID;
    }

    /** 
     * Set the 'leagueID' element value.
     * 
     * @param leagueID
     */
    public void setLeagueID(int leagueID) {
        this.leagueID = leagueID;
    }

    /** 
     * Get the 'leagueName' element value.
     * 
     * @return value
     */
    public String getLeagueName() {
        return leagueName;
    }

    /** 
     * Set the 'leagueName' element value.
     * 
     * @param leagueName
     */
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    /** 
     * Get the 'leagueSaison' element value.
     * 
     * @return value
     */
    public String getLeagueSaison() {
        return leagueSaison;
    }

    /** 
     * Set the 'leagueSaison' element value.
     * 
     * @param leagueSaison
     */
    public void setLeagueSaison(String leagueSaison) {
        this.leagueSaison = leagueSaison;
    }

    /** 
     * Get the 'leagueShortcut' element value.
     * 
     * @return value
     */
    public String getLeagueShortcut() {
        return leagueShortcut;
    }

    /** 
     * Set the 'leagueShortcut' element value.
     * 
     * @param leagueShortcut
     */
    public void setLeagueShortcut(String leagueShortcut) {
        this.leagueShortcut = leagueShortcut;
    }

    /** 
     * Get the 'nameTeam1' element value.
     * 
     * @return value
     */
    public String getNameTeam1() {
        return nameTeam1;
    }

    /** 
     * Set the 'nameTeam1' element value.
     * 
     * @param nameTeam1
     */
    public void setNameTeam1(String nameTeam1) {
        this.nameTeam1 = nameTeam1;
    }

    /** 
     * Get the 'nameTeam2' element value.
     * 
     * @return value
     */
    public String getNameTeam2() {
        return nameTeam2;
    }

    /** 
     * Set the 'nameTeam2' element value.
     * 
     * @param nameTeam2
     */
    public void setNameTeam2(String nameTeam2) {
        this.nameTeam2 = nameTeam2;
    }

    /** 
     * Get the 'idTeam1' element value.
     * 
     * @return value
     */
    public int getIdTeam1() {
        return idTeam1;
    }

    /** 
     * Set the 'idTeam1' element value.
     * 
     * @param idTeam1
     */
    public void setIdTeam1(int idTeam1) {
        this.idTeam1 = idTeam1;
    }

    /** 
     * Get the 'idTeam2' element value.
     * 
     * @return value
     */
    public int getIdTeam2() {
        return idTeam2;
    }

    /** 
     * Set the 'idTeam2' element value.
     * 
     * @param idTeam2
     */
    public void setIdTeam2(int idTeam2) {
        this.idTeam2 = idTeam2;
    }

    /** 
     * Get the 'iconUrlTeam1' element value.
     * 
     * @return value
     */
    public String getIconUrlTeam1() {
        return iconUrlTeam1;
    }

    /** 
     * Set the 'iconUrlTeam1' element value.
     * 
     * @param iconUrlTeam1
     */
    public void setIconUrlTeam1(String iconUrlTeam1) {
        this.iconUrlTeam1 = iconUrlTeam1;
    }

    /** 
     * Get the 'iconUrlTeam2' element value.
     * 
     * @return value
     */
    public String getIconUrlTeam2() {
        return iconUrlTeam2;
    }

    /** 
     * Set the 'iconUrlTeam2' element value.
     * 
     * @param iconUrlTeam2
     */
    public void setIconUrlTeam2(String iconUrlTeam2) {
        this.iconUrlTeam2 = iconUrlTeam2;
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
     * Get the 'lastUpdate' element value.
     * 
     * @return value
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /** 
     * Set the 'lastUpdate' element value.
     * 
     * @param lastUpdate
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    /** 
     * Get the 'matchIsFinished' element value.
     * 
     * @return value
     */
    public boolean isMatchIsFinished() {
        return matchIsFinished;
    }

    /** 
     * Set the 'matchIsFinished' element value.
     * 
     * @param matchIsFinished
     */
    public void setMatchIsFinished(boolean matchIsFinished) {
        this.matchIsFinished = matchIsFinished;
    }

    

    /** 
     * Get the 'location' element value.
     * 
     * @return value
     */
    public Location getLocation() {
        return location;
    }

    /** 
     * Set the 'location' element value.
     * 
     * @param location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /** 
     * Get the 'NumberOfViewers' element value.
     * 
     * @return value
     */
    public Integer getNumberOfViewers() {
        return numberOfViewers;
    }

    /** 
     * Set the 'NumberOfViewers' element value.
     * 
     * @param numberOfViewers
     */
    public void setNumberOfViewers(Integer numberOfViewers) {
        this.numberOfViewers = numberOfViewers;
    }

	/**
	 * @return the matchResultList
	 */
	public List<MatchResult> getMatchResultList() {
		return matchResultList;
	}

	/**
	 * @param matchResultList the matchResultList to set
	 */
	public void setMatchResultList(List<MatchResult> matchResultList) {
		this.matchResultList = matchResultList;
	}

	/**
	 * @return the goalList
	 */
	public List<Goal> getGoalList() {
		return goalList;
	}

	/**
	 * @param goalList the goalList to set
	 */
	public void setGoalList(List<Goal> goalList) {
		this.goalList = goalList;
	}
}
