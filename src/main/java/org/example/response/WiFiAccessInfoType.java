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
import javax.xml.datatype.XMLGregorianCalendar;
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
 * WiFi的使用存取紀錄資料
 * 
 * <p>WiFiAccessInfoType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="WiFiAccessInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Duration"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;group ref="{http://www.example.org/response}DataUsage"/&gt;
 *         &lt;element name="UserAccount" type="{http://www.example.org/common}AccountType"/&gt;
 *         &lt;element name="UserDeviceIP" type="{http://www.example.org/common}IPAddressType"/&gt;
 *         &lt;element name="UserDeviceMAC" type="{http://www.example.org/common}MACAddressType"/&gt;
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
@XmlType(name = "WiFiAccessInfoType", propOrder = {
    "startDT",
    "duration",
    "endDT",
    "uploadDataUsage",
    "downloadDataUsage",
    "totalDataUsage",
    "userAccount",
    "userDeviceIP",
    "userDeviceMAC",
    "note"
})
public class WiFiAccessInfoType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "StartDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDT;
    @XmlElement(name = "Duration")
    protected long duration;
    @XmlElement(name = "EndDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDT;
    @XmlElement(name = "UploadDataUsage", required = true)
    protected DataUsageType uploadDataUsage;
    @XmlElement(name = "DownloadDataUsage", required = true)
    protected DataUsageType downloadDataUsage;
    @XmlElement(name = "TotalDataUsage", required = true)
    protected DataUsageType totalDataUsage;
    @XmlElement(name = "UserAccount", required = true)
    protected String userAccount;
    @XmlElement(name = "UserDeviceIP", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String userDeviceIP;
    @XmlElement(name = "UserDeviceMAC", required = true)
    protected String userDeviceMAC;
    @XmlElement(name = "Note", required = true)
    protected String note;

    /**
     * 取得 startDT 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDT() {
        return startDT;
    }

    /**
     * 設定 startDT 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDT(XMLGregorianCalendar value) {
        this.startDT = value;
    }

    /**
     * 取得 duration 特性的值.
     * 
     */
    public long getDuration() {
        return duration;
    }

    /**
     * 設定 duration 特性的值.
     * 
     */
    public void setDuration(long value) {
        this.duration = value;
    }

    /**
     * 取得 endDT 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDT() {
        return endDT;
    }

    /**
     * 設定 endDT 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDT(XMLGregorianCalendar value) {
        this.endDT = value;
    }

    /**
     * 取得 uploadDataUsage 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DataUsageType }
     *     
     */
    public DataUsageType getUploadDataUsage() {
        return uploadDataUsage;
    }

    /**
     * 設定 uploadDataUsage 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DataUsageType }
     *     
     */
    public void setUploadDataUsage(DataUsageType value) {
        this.uploadDataUsage = value;
    }

    /**
     * 取得 downloadDataUsage 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DataUsageType }
     *     
     */
    public DataUsageType getDownloadDataUsage() {
        return downloadDataUsage;
    }

    /**
     * 設定 downloadDataUsage 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DataUsageType }
     *     
     */
    public void setDownloadDataUsage(DataUsageType value) {
        this.downloadDataUsage = value;
    }

    /**
     * 取得 totalDataUsage 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DataUsageType }
     *     
     */
    public DataUsageType getTotalDataUsage() {
        return totalDataUsage;
    }

    /**
     * 設定 totalDataUsage 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DataUsageType }
     *     
     */
    public void setTotalDataUsage(DataUsageType value) {
        this.totalDataUsage = value;
    }

    /**
     * 取得 userAccount 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAccount() {
        return userAccount;
    }

    /**
     * 設定 userAccount 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAccount(String value) {
        this.userAccount = value;
    }

    /**
     * 取得 userDeviceIP 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDeviceIP() {
        return userDeviceIP;
    }

    /**
     * 設定 userDeviceIP 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDeviceIP(String value) {
        this.userDeviceIP = value;
    }

    /**
     * 取得 userDeviceMAC 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserDeviceMAC() {
        return userDeviceMAC;
    }

    /**
     * 設定 userDeviceMAC 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserDeviceMAC(String value) {
        this.userDeviceMAC = value;
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
        if (!(object instanceof WiFiAccessInfoType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WiFiAccessInfoType that = ((WiFiAccessInfoType) object);
        {
            XMLGregorianCalendar lhsStartDT;
            lhsStartDT = this.getStartDT();
            XMLGregorianCalendar rhsStartDT;
            rhsStartDT = that.getStartDT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startDT", lhsStartDT), LocatorUtils.property(thatLocator, "startDT", rhsStartDT), lhsStartDT, rhsStartDT)) {
                return false;
            }
        }
        {
            long lhsDuration;
            lhsDuration = this.getDuration();
            long rhsDuration;
            rhsDuration = that.getDuration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "duration", lhsDuration), LocatorUtils.property(thatLocator, "duration", rhsDuration), lhsDuration, rhsDuration)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsEndDT;
            lhsEndDT = this.getEndDT();
            XMLGregorianCalendar rhsEndDT;
            rhsEndDT = that.getEndDT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDT", lhsEndDT), LocatorUtils.property(thatLocator, "endDT", rhsEndDT), lhsEndDT, rhsEndDT)) {
                return false;
            }
        }
        {
            DataUsageType lhsUploadDataUsage;
            lhsUploadDataUsage = this.getUploadDataUsage();
            DataUsageType rhsUploadDataUsage;
            rhsUploadDataUsage = that.getUploadDataUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uploadDataUsage", lhsUploadDataUsage), LocatorUtils.property(thatLocator, "uploadDataUsage", rhsUploadDataUsage), lhsUploadDataUsage, rhsUploadDataUsage)) {
                return false;
            }
        }
        {
            DataUsageType lhsDownloadDataUsage;
            lhsDownloadDataUsage = this.getDownloadDataUsage();
            DataUsageType rhsDownloadDataUsage;
            rhsDownloadDataUsage = that.getDownloadDataUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "downloadDataUsage", lhsDownloadDataUsage), LocatorUtils.property(thatLocator, "downloadDataUsage", rhsDownloadDataUsage), lhsDownloadDataUsage, rhsDownloadDataUsage)) {
                return false;
            }
        }
        {
            DataUsageType lhsTotalDataUsage;
            lhsTotalDataUsage = this.getTotalDataUsage();
            DataUsageType rhsTotalDataUsage;
            rhsTotalDataUsage = that.getTotalDataUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "totalDataUsage", lhsTotalDataUsage), LocatorUtils.property(thatLocator, "totalDataUsage", rhsTotalDataUsage), lhsTotalDataUsage, rhsTotalDataUsage)) {
                return false;
            }
        }
        {
            String lhsUserAccount;
            lhsUserAccount = this.getUserAccount();
            String rhsUserAccount;
            rhsUserAccount = that.getUserAccount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userAccount", lhsUserAccount), LocatorUtils.property(thatLocator, "userAccount", rhsUserAccount), lhsUserAccount, rhsUserAccount)) {
                return false;
            }
        }
        {
            String lhsUserDeviceIP;
            lhsUserDeviceIP = this.getUserDeviceIP();
            String rhsUserDeviceIP;
            rhsUserDeviceIP = that.getUserDeviceIP();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDeviceIP", lhsUserDeviceIP), LocatorUtils.property(thatLocator, "userDeviceIP", rhsUserDeviceIP), lhsUserDeviceIP, rhsUserDeviceIP)) {
                return false;
            }
        }
        {
            String lhsUserDeviceMAC;
            lhsUserDeviceMAC = this.getUserDeviceMAC();
            String rhsUserDeviceMAC;
            rhsUserDeviceMAC = that.getUserDeviceMAC();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "userDeviceMAC", lhsUserDeviceMAC), LocatorUtils.property(thatLocator, "userDeviceMAC", rhsUserDeviceMAC), lhsUserDeviceMAC, rhsUserDeviceMAC)) {
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
            XMLGregorianCalendar theStartDT;
            theStartDT = this.getStartDT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDT", theStartDT), currentHashCode, theStartDT);
        }
        {
            long theDuration;
            theDuration = this.getDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duration", theDuration), currentHashCode, theDuration);
        }
        {
            XMLGregorianCalendar theEndDT;
            theEndDT = this.getEndDT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDT", theEndDT), currentHashCode, theEndDT);
        }
        {
            DataUsageType theUploadDataUsage;
            theUploadDataUsage = this.getUploadDataUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uploadDataUsage", theUploadDataUsage), currentHashCode, theUploadDataUsage);
        }
        {
            DataUsageType theDownloadDataUsage;
            theDownloadDataUsage = this.getDownloadDataUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "downloadDataUsage", theDownloadDataUsage), currentHashCode, theDownloadDataUsage);
        }
        {
            DataUsageType theTotalDataUsage;
            theTotalDataUsage = this.getTotalDataUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "totalDataUsage", theTotalDataUsage), currentHashCode, theTotalDataUsage);
        }
        {
            String theUserAccount;
            theUserAccount = this.getUserAccount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userAccount", theUserAccount), currentHashCode, theUserAccount);
        }
        {
            String theUserDeviceIP;
            theUserDeviceIP = this.getUserDeviceIP();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userDeviceIP", theUserDeviceIP), currentHashCode, theUserDeviceIP);
        }
        {
            String theUserDeviceMAC;
            theUserDeviceMAC = this.getUserDeviceMAC();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "userDeviceMAC", theUserDeviceMAC), currentHashCode, theUserDeviceMAC);
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
            XMLGregorianCalendar theStartDT;
            theStartDT = this.getStartDT();
            strategy.appendField(locator, this, "startDT", buffer, theStartDT);
        }
        {
            long theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration);
        }
        {
            XMLGregorianCalendar theEndDT;
            theEndDT = this.getEndDT();
            strategy.appendField(locator, this, "endDT", buffer, theEndDT);
        }
        {
            DataUsageType theUploadDataUsage;
            theUploadDataUsage = this.getUploadDataUsage();
            strategy.appendField(locator, this, "uploadDataUsage", buffer, theUploadDataUsage);
        }
        {
            DataUsageType theDownloadDataUsage;
            theDownloadDataUsage = this.getDownloadDataUsage();
            strategy.appendField(locator, this, "downloadDataUsage", buffer, theDownloadDataUsage);
        }
        {
            DataUsageType theTotalDataUsage;
            theTotalDataUsage = this.getTotalDataUsage();
            strategy.appendField(locator, this, "totalDataUsage", buffer, theTotalDataUsage);
        }
        {
            String theUserAccount;
            theUserAccount = this.getUserAccount();
            strategy.appendField(locator, this, "userAccount", buffer, theUserAccount);
        }
        {
            String theUserDeviceIP;
            theUserDeviceIP = this.getUserDeviceIP();
            strategy.appendField(locator, this, "userDeviceIP", buffer, theUserDeviceIP);
        }
        {
            String theUserDeviceMAC;
            theUserDeviceMAC = this.getUserDeviceMAC();
            strategy.appendField(locator, this, "userDeviceMAC", buffer, theUserDeviceMAC);
        }
        {
            String theNote;
            theNote = this.getNote();
            strategy.appendField(locator, this, "note", buffer, theNote);
        }
        return buffer;
    }

}
