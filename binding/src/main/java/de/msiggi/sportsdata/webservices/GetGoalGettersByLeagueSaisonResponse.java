
package de.msiggi.sportsdata.webservices;

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
public class GetGoalGettersByLeagueSaisonResponse
{
    private ArrayOfGoalGetter getGoalGettersByLeagueSaisonResult;

    /** 
     * Get the 'GetGoalGettersByLeagueSaisonResult' element value.
     * 
     * @return value
     */
    public ArrayOfGoalGetter getGetGoalGettersByLeagueSaisonResult() {
        return getGoalGettersByLeagueSaisonResult;
    }

    /** 
     * Set the 'GetGoalGettersByLeagueSaisonResult' element value.
     * 
     * @param getGoalGettersByLeagueSaisonResult
     */
    public void setGetGoalGettersByLeagueSaisonResult(
            ArrayOfGoalGetter getGoalGettersByLeagueSaisonResult) {
        this.getGoalGettersByLeagueSaisonResult = getGoalGettersByLeagueSaisonResult;
    }
}
