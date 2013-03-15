
package de.msiggi.sportsdata.webservices;

import java.util.Date;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Fussballdaten">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="SpielID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="Spieltag" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:dateTime" name="Spieldatum" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="Team1" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="Team2" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="ErgebnisTeam1" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:int" name="ErgebnisTeam2" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:dateTime" name="lastUpdate" minOccurs="1" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Fussballdaten
{
    private int spielID;
    private int spieltag;
    private Date spieldatum;
    private String team1;
    private String team2;
    private int ergebnisTeam1;
    private int ergebnisTeam2;
    private Date lastUpdate;

    /** 
     * Get the 'SpielID' element value.
     * 
     * @return value
     */
    public int getSpielID() {
        return spielID;
    }

    /** 
     * Set the 'SpielID' element value.
     * 
     * @param spielID
     */
    public void setSpielID(int spielID) {
        this.spielID = spielID;
    }

    /** 
     * Get the 'Spieltag' element value.
     * 
     * @return value
     */
    public int getSpieltag() {
        return spieltag;
    }

    /** 
     * Set the 'Spieltag' element value.
     * 
     * @param spieltag
     */
    public void setSpieltag(int spieltag) {
        this.spieltag = spieltag;
    }

    /** 
     * Get the 'Spieldatum' element value.
     * 
     * @return value
     */
    public Date getSpieldatum() {
        return spieldatum;
    }

    /** 
     * Set the 'Spieldatum' element value.
     * 
     * @param spieldatum
     */
    public void setSpieldatum(Date spieldatum) {
        this.spieldatum = spieldatum;
    }

    /** 
     * Get the 'Team1' element value.
     * 
     * @return value
     */
    public String getTeam1() {
        return team1;
    }

    /** 
     * Set the 'Team1' element value.
     * 
     * @param team1
     */
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    /** 
     * Get the 'Team2' element value.
     * 
     * @return value
     */
    public String getTeam2() {
        return team2;
    }

    /** 
     * Set the 'Team2' element value.
     * 
     * @param team2
     */
    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    /** 
     * Get the 'ErgebnisTeam1' element value.
     * 
     * @return value
     */
    public int getErgebnisTeam1() {
        return ergebnisTeam1;
    }

    /** 
     * Set the 'ErgebnisTeam1' element value.
     * 
     * @param ergebnisTeam1
     */
    public void setErgebnisTeam1(int ergebnisTeam1) {
        this.ergebnisTeam1 = ergebnisTeam1;
    }

    /** 
     * Get the 'ErgebnisTeam2' element value.
     * 
     * @return value
     */
    public int getErgebnisTeam2() {
        return ergebnisTeam2;
    }

    /** 
     * Set the 'ErgebnisTeam2' element value.
     * 
     * @param ergebnisTeam2
     */
    public void setErgebnisTeam2(int ergebnisTeam2) {
        this.ergebnisTeam2 = ergebnisTeam2;
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
}
