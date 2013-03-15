
package de.msiggi.sportsdata.webservices;

/** 
 * Schema fragment(s) for this class:
 * <pre>
 * &lt;xs:complexType xmlns:ns="http://msiggi.de/Sportsdata/Webservices" xmlns:xs="http://www.w3.org/2001/XMLSchema" name="Location">
 *   &lt;xs:sequence>
 *     &lt;xs:element type="xs:int" name="locationID" minOccurs="1" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="locationCity" minOccurs="0" maxOccurs="1"/>
 *     &lt;xs:element type="xs:string" name="locationStadium" minOccurs="0" maxOccurs="1"/>
 *   &lt;/xs:sequence>
 * &lt;/xs:complexType>
 * </pre>
 */
public class Location
{
    private int locationID;
    private String locationCity;
    private String locationStadium;

    /** 
     * Get the 'locationID' element value.
     * 
     * @return value
     */
    public int getLocationID() {
        return locationID;
    }

    /** 
     * Set the 'locationID' element value.
     * 
     * @param locationID
     */
    public void setLocationID(int locationID) {
        this.locationID = locationID;
    }

    /** 
     * Get the 'locationCity' element value.
     * 
     * @return value
     */
    public String getLocationCity() {
        return locationCity;
    }

    /** 
     * Set the 'locationCity' element value.
     * 
     * @param locationCity
     */
    public void setLocationCity(String locationCity) {
        this.locationCity = locationCity;
    }

    /** 
     * Get the 'locationStadium' element value.
     * 
     * @return value
     */
    public String getLocationStadium() {
        return locationStadium;
    }

    /** 
     * Set the 'locationStadium' element value.
     * 
     * @param locationStadium
     */
    public void setLocationStadium(String locationStadium) {
        this.locationStadium = locationStadium;
    }
}
