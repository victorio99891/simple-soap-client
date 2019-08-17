
package pl.wiktor.first_soap_example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="newUser" type="{http://wiktor.pl/first-soap-example}user"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "newUser"
})
@XmlRootElement(name = "addUserRequest")
public class AddUserRequest
    implements ToString
{

    @XmlElement(required = true)
    protected User newUser;

    /**
     * Gets the value of the newUser property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getNewUser() {
        return newUser;
    }

    /**
     * Sets the value of the newUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setNewUser(User value) {
        this.newUser = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            User theNewUser;
            theNewUser = this.getNewUser();
            strategy.appendField(locator, this, "newUser", buffer, theNewUser);
        }
        return buffer;
    }

}
