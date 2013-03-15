
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:element xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="GetFusballdaten">
 *   &lt;xs:complexType>
 *     &lt;xs:sequence>
 *       &lt;xs:element type="xs:int" name="Spieltag" minOccurs="1" maxOccurs="1"/>
 *       &lt;xs:element type="xs:string" name="Liga" minOccurs="0" maxOccurs="1"/>
 *       &lt;xs:element type="xs:int" name="Saison" minOccurs="1" maxOccurs="1"/>
 *       &lt;xs:element type="xs:string" name="Userkennung" minOccurs="0" maxOccurs="1"/>
 *     &lt;/xs:sequence>
 *   &lt;/xs:complexType>
 * &lt;/xs:element>
 * </pre>
 */
public class GetFusballdaten
{
    private int spieltag;
    private String liga;
    private int saison;
    private String userkennung;

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
     * Get the 'Liga' element value.
     * 
     * @return value
     */
    public String getLiga() {
        return liga;
    }

    /** 
     * Set the 'Liga' element value.
     * 
     * @param liga
     */
    public void setLiga(String liga) {
        this.liga = liga;
    }

    /** 
     * Get the 'Saison' element value.
     * 
     * @return value
     */
    public int getSaison() {
        return saison;
    }

    /** 
     * Set the 'Saison' element value.
     * 
     * @param saison
     */
    public void setSaison(int saison) {
        this.saison = saison;
    }

    /** 
     * Get the 'Userkennung' element value.
     * 
     * @return value
     */
    public String getUserkennung() {
        return userkennung;
    }

    /** 
     * Set the 'Userkennung' element value.
     * 
     * @param userkennung
     */
    public void setUserkennung(String userkennung) {
        this.userkennung = userkennung;
    }
}
