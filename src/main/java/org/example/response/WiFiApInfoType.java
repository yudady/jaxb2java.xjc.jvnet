//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.03.22 於 01:32:24 PM CST 
//


package org.example.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * WiFi的Ap主機資訊
 * 
 * <p>WiFiApInfoType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="WiFiApInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WiFiApID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="([\d\w]{1,15})?"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WiFiApAddress" type="{http://www.example.org/common}AddressType"/&gt;
 *         &lt;element name="WiFiApType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WiFiApIP" type="{http://www.example.org/common}IPAddressType"/&gt;
 *         &lt;element name="WiFiApMAC" type="{http://www.example.org/common}MACAddressType"/&gt;
 *         &lt;element name="Longitude"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="-180"/&gt;
 *               &lt;maxInclusive value="180"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Latitude"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double"&gt;
 *               &lt;minInclusive value="-90"/&gt;
 *               &lt;maxInclusive value="90"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InDoorOutDoor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="INDOOR"/&gt;
 *               &lt;enumeration value="OUTDOOR"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Note" type="{http://www.example.org/common}NoteType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiApInfoType", propOrder = {
    "wiFiApID",
    "wiFiApAddress",
    "wiFiApType",
    "wiFiApIP",
    "wiFiApMAC",
    "longitude",
    "latitude",
    "inDoorOutDoor",
    "note"
})
public class WiFiApInfoType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "WiFiApID", required = true)
    protected String wiFiApID;
    @XmlElement(name = "WiFiApAddress", required = true)
    protected String wiFiApAddress;
    @XmlElement(name = "WiFiApType", required = true)
    protected String wiFiApType;
    @XmlElement(name = "WiFiApIP", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String wiFiApIP;
    @XmlElement(name = "WiFiApMAC", required = true)
    protected String wiFiApMAC;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "InDoorOutDoor", required = true)
    protected String inDoorOutDoor;
    @XmlElement(name = "Note", required = true)
    protected String note;

    /**
     * 取得 wiFiApID 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiFiApID() {
        return wiFiApID;
    }

    /**
     * 設定 wiFiApID 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiFiApID(String value) {
        this.wiFiApID = value;
    }

    /**
     * 取得 wiFiApAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiFiApAddress() {
        return wiFiApAddress;
    }

    /**
     * 設定 wiFiApAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiFiApAddress(String value) {
        this.wiFiApAddress = value;
    }

    /**
     * 取得 wiFiApType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiFiApType() {
        return wiFiApType;
    }

    /**
     * 設定 wiFiApType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiFiApType(String value) {
        this.wiFiApType = value;
    }

    /**
     * 取得 wiFiApIP 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiFiApIP() {
        return wiFiApIP;
    }

    /**
     * 設定 wiFiApIP 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiFiApIP(String value) {
        this.wiFiApIP = value;
    }

    /**
     * 取得 wiFiApMAC 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWiFiApMAC() {
        return wiFiApMAC;
    }

    /**
     * 設定 wiFiApMAC 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWiFiApMAC(String value) {
        this.wiFiApMAC = value;
    }

    /**
     * 取得 longitude 特性的值.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * 設定 longitude 特性的值.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * 取得 latitude 特性的值.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * 設定 latitude 特性的值.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * 取得 inDoorOutDoor 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInDoorOutDoor() {
        return inDoorOutDoor;
    }

    /**
     * 設定 inDoorOutDoor 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInDoorOutDoor(String value) {
        this.inDoorOutDoor = value;
    }

    /**
     * 取得 note 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * 設定 note 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WiFiApInfoType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WiFiApInfoType that = ((WiFiApInfoType) object);
        {
            String lhsWiFiApID;
            lhsWiFiApID = this.getWiFiApID();
            String rhsWiFiApID;
            rhsWiFiApID = that.getWiFiApID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiFiApID", lhsWiFiApID), LocatorUtils.property(thatLocator, "wiFiApID", rhsWiFiApID), lhsWiFiApID, rhsWiFiApID)) {
                return false;
            }
        }
        {
            String lhsWiFiApAddress;
            lhsWiFiApAddress = this.getWiFiApAddress();
            String rhsWiFiApAddress;
            rhsWiFiApAddress = that.getWiFiApAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiFiApAddress", lhsWiFiApAddress), LocatorUtils.property(thatLocator, "wiFiApAddress", rhsWiFiApAddress), lhsWiFiApAddress, rhsWiFiApAddress)) {
                return false;
            }
        }
        {
            String lhsWiFiApType;
            lhsWiFiApType = this.getWiFiApType();
            String rhsWiFiApType;
            rhsWiFiApType = that.getWiFiApType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiFiApType", lhsWiFiApType), LocatorUtils.property(thatLocator, "wiFiApType", rhsWiFiApType), lhsWiFiApType, rhsWiFiApType)) {
                return false;
            }
        }
        {
            String lhsWiFiApIP;
            lhsWiFiApIP = this.getWiFiApIP();
            String rhsWiFiApIP;
            rhsWiFiApIP = that.getWiFiApIP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiFiApIP", lhsWiFiApIP), LocatorUtils.property(thatLocator, "wiFiApIP", rhsWiFiApIP), lhsWiFiApIP, rhsWiFiApIP)) {
                return false;
            }
        }
        {
            String lhsWiFiApMAC;
            lhsWiFiApMAC = this.getWiFiApMAC();
            String rhsWiFiApMAC;
            rhsWiFiApMAC = that.getWiFiApMAC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiFiApMAC", lhsWiFiApMAC), LocatorUtils.property(thatLocator, "wiFiApMAC", rhsWiFiApMAC), lhsWiFiApMAC, rhsWiFiApMAC)) {
                return false;
            }
        }
        {
            double lhsLongitude;
            lhsLongitude = this.getLongitude();
            double rhsLongitude;
            rhsLongitude = that.getLongitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "longitude", lhsLongitude), LocatorUtils.property(thatLocator, "longitude", rhsLongitude), lhsLongitude, rhsLongitude)) {
                return false;
            }
        }
        {
            double lhsLatitude;
            lhsLatitude = this.getLatitude();
            double rhsLatitude;
            rhsLatitude = that.getLatitude();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "latitude", lhsLatitude), LocatorUtils.property(thatLocator, "latitude", rhsLatitude), lhsLatitude, rhsLatitude)) {
                return false;
            }
        }
        {
            String lhsInDoorOutDoor;
            lhsInDoorOutDoor = this.getInDoorOutDoor();
            String rhsInDoorOutDoor;
            rhsInDoorOutDoor = that.getInDoorOutDoor();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "inDoorOutDoor", lhsInDoorOutDoor), LocatorUtils.property(thatLocator, "inDoorOutDoor", rhsInDoorOutDoor), lhsInDoorOutDoor, rhsInDoorOutDoor)) {
                return false;
            }
        }
        {
            String lhsNote;
            lhsNote = this.getNote();
            String rhsNote;
            rhsNote = that.getNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            String theWiFiApID;
            theWiFiApID = this.getWiFiApID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wiFiApID", theWiFiApID), currentHashCode, theWiFiApID);
        }
        {
            String theWiFiApAddress;
            theWiFiApAddress = this.getWiFiApAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wiFiApAddress", theWiFiApAddress), currentHashCode, theWiFiApAddress);
        }
        {
            String theWiFiApType;
            theWiFiApType = this.getWiFiApType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wiFiApType", theWiFiApType), currentHashCode, theWiFiApType);
        }
        {
            String theWiFiApIP;
            theWiFiApIP = this.getWiFiApIP();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wiFiApIP", theWiFiApIP), currentHashCode, theWiFiApIP);
        }
        {
            String theWiFiApMAC;
            theWiFiApMAC = this.getWiFiApMAC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wiFiApMAC", theWiFiApMAC), currentHashCode, theWiFiApMAC);
        }
        {
            double theLongitude;
            theLongitude = this.getLongitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "longitude", theLongitude), currentHashCode, theLongitude);
        }
        {
            double theLatitude;
            theLatitude = this.getLatitude();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "latitude", theLatitude), currentHashCode, theLatitude);
        }
        {
            String theInDoorOutDoor;
            theInDoorOutDoor = this.getInDoorOutDoor();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "inDoorOutDoor", theInDoorOutDoor), currentHashCode, theInDoorOutDoor);
        }
        {
            String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
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
            String theWiFiApID;
            theWiFiApID = this.getWiFiApID();
            strategy.appendField(locator, this, "wiFiApID", buffer, theWiFiApID);
        }
        {
            String theWiFiApAddress;
            theWiFiApAddress = this.getWiFiApAddress();
            strategy.appendField(locator, this, "wiFiApAddress", buffer, theWiFiApAddress);
        }
        {
            String theWiFiApType;
            theWiFiApType = this.getWiFiApType();
            strategy.appendField(locator, this, "wiFiApType", buffer, theWiFiApType);
        }
        {
            String theWiFiApIP;
            theWiFiApIP = this.getWiFiApIP();
            strategy.appendField(locator, this, "wiFiApIP", buffer, theWiFiApIP);
        }
        {
            String theWiFiApMAC;
            theWiFiApMAC = this.getWiFiApMAC();
            strategy.appendField(locator, this, "wiFiApMAC", buffer, theWiFiApMAC);
        }
        {
            double theLongitude;
            theLongitude = this.getLongitude();
            strategy.appendField(locator, this, "longitude", buffer, theLongitude);
        }
        {
            double theLatitude;
            theLatitude = this.getLatitude();
            strategy.appendField(locator, this, "latitude", buffer, theLatitude);
        }
        {
            String theInDoorOutDoor;
            theInDoorOutDoor = this.getInDoorOutDoor();
            strategy.appendField(locator, this, "inDoorOutDoor", buffer, theInDoorOutDoor);
        }
        {
            String theNote;
            theNote = this.getNote();
            strategy.appendField(locator, this, "note", buffer, theNote);
        }
        return buffer;
    }

}
