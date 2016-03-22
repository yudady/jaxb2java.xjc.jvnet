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
 * 通聯之基地台相關資訊
 * 
 * <p>CellInfoType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="CellInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StartDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Duration"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}long"&gt;
 *               &lt;maxInclusive value="999999999"/&gt;
 *               &lt;minInclusive value="0"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;group ref="{http://www.example.org/response}StartCell" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.example.org/response}EndCell" minOccurs="0"/&gt;
 *         &lt;group ref="{http://www.example.org/response}DataUsage" minOccurs="0"/&gt;
 *         &lt;element name="IMEI"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
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
@XmlType(name = "CellInfoType", propOrder = {
    "startDT",
    "duration",
    "endDT",
    "cellID",
    "cellAddress",
    "cellEndID",
    "cellEndAddress",
    "uploadDataUsage",
    "downloadDataUsage",
    "totalDataUsage",
    "imei",
    "note"
})
public class CellInfoType implements Equals, HashCode, ToString
{

    @XmlElement(name = "StartDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDT;
    @XmlElement(name = "Duration")
    protected int duration;
    @XmlElement(name = "EndDT", required = true, defaultValue = "1970-01-01T00:00:00", nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDT;
    @XmlElement(name = "CellID")
    protected String cellID;
    @XmlElement(name = "CellAddress")
    protected String cellAddress;
    @XmlElement(name = "CellEndID")
    protected String cellEndID;
    @XmlElement(name = "CellEndAddress")
    protected String cellEndAddress;
    @XmlElement(name = "UploadDataUsage")
    protected DataUsageType uploadDataUsage;
    @XmlElement(name = "DownloadDataUsage")
    protected DataUsageType downloadDataUsage;
    @XmlElement(name = "TotalDataUsage")
    protected DataUsageType totalDataUsage;
    @XmlElement(name = "IMEI", required = true)
    protected String imei;
    @XmlElement(name = "Note", required = true, nillable = true)
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
    public int getDuration() {
        return duration;
    }

    /**
     * 設定 duration 特性的值.
     * 
     */
    public void setDuration(int value) {
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
     * 取得 cellID 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellID() {
        return cellID;
    }

    /**
     * 設定 cellID 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellID(String value) {
        this.cellID = value;
    }

    /**
     * 取得 cellAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellAddress() {
        return cellAddress;
    }

    /**
     * 設定 cellAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellAddress(String value) {
        this.cellAddress = value;
    }

    /**
     * 取得 cellEndID 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellEndID() {
        return cellEndID;
    }

    /**
     * 設定 cellEndID 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellEndID(String value) {
        this.cellEndID = value;
    }

    /**
     * 取得 cellEndAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellEndAddress() {
        return cellEndAddress;
    }

    /**
     * 設定 cellEndAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellEndAddress(String value) {
        this.cellEndAddress = value;
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
     * 取得 imei 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIMEI() {
        return imei;
    }

    /**
     * 設定 imei 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIMEI(String value) {
        this.imei = value;
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
        if (!(object instanceof CellInfoType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CellInfoType that = ((CellInfoType) object);
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
            int lhsDuration;
            lhsDuration = this.getDuration();
            int rhsDuration;
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
            String lhsCellID;
            lhsCellID = this.getCellID();
            String rhsCellID;
            rhsCellID = that.getCellID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellID", lhsCellID), LocatorUtils.property(thatLocator, "cellID", rhsCellID), lhsCellID, rhsCellID)) {
                return false;
            }
        }
        {
            String lhsCellAddress;
            lhsCellAddress = this.getCellAddress();
            String rhsCellAddress;
            rhsCellAddress = that.getCellAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellAddress", lhsCellAddress), LocatorUtils.property(thatLocator, "cellAddress", rhsCellAddress), lhsCellAddress, rhsCellAddress)) {
                return false;
            }
        }
        {
            String lhsCellEndID;
            lhsCellEndID = this.getCellEndID();
            String rhsCellEndID;
            rhsCellEndID = that.getCellEndID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellEndID", lhsCellEndID), LocatorUtils.property(thatLocator, "cellEndID", rhsCellEndID), lhsCellEndID, rhsCellEndID)) {
                return false;
            }
        }
        {
            String lhsCellEndAddress;
            lhsCellEndAddress = this.getCellEndAddress();
            String rhsCellEndAddress;
            rhsCellEndAddress = that.getCellEndAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellEndAddress", lhsCellEndAddress), LocatorUtils.property(thatLocator, "cellEndAddress", rhsCellEndAddress), lhsCellEndAddress, rhsCellEndAddress)) {
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
            String lhsIMEI;
            lhsIMEI = this.getIMEI();
            String rhsIMEI;
            rhsIMEI = that.getIMEI();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "imei", lhsIMEI), LocatorUtils.property(thatLocator, "imei", rhsIMEI), lhsIMEI, rhsIMEI)) {
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
            int theDuration;
            theDuration = this.getDuration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "duration", theDuration), currentHashCode, theDuration);
        }
        {
            XMLGregorianCalendar theEndDT;
            theEndDT = this.getEndDT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDT", theEndDT), currentHashCode, theEndDT);
        }
        {
            String theCellID;
            theCellID = this.getCellID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellID", theCellID), currentHashCode, theCellID);
        }
        {
            String theCellAddress;
            theCellAddress = this.getCellAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellAddress", theCellAddress), currentHashCode, theCellAddress);
        }
        {
            String theCellEndID;
            theCellEndID = this.getCellEndID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellEndID", theCellEndID), currentHashCode, theCellEndID);
        }
        {
            String theCellEndAddress;
            theCellEndAddress = this.getCellEndAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellEndAddress", theCellEndAddress), currentHashCode, theCellEndAddress);
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
            String theIMEI;
            theIMEI = this.getIMEI();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "imei", theIMEI), currentHashCode, theIMEI);
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
            int theDuration;
            theDuration = this.getDuration();
            strategy.appendField(locator, this, "duration", buffer, theDuration);
        }
        {
            XMLGregorianCalendar theEndDT;
            theEndDT = this.getEndDT();
            strategy.appendField(locator, this, "endDT", buffer, theEndDT);
        }
        {
            String theCellID;
            theCellID = this.getCellID();
            strategy.appendField(locator, this, "cellID", buffer, theCellID);
        }
        {
            String theCellAddress;
            theCellAddress = this.getCellAddress();
            strategy.appendField(locator, this, "cellAddress", buffer, theCellAddress);
        }
        {
            String theCellEndID;
            theCellEndID = this.getCellEndID();
            strategy.appendField(locator, this, "cellEndID", buffer, theCellEndID);
        }
        {
            String theCellEndAddress;
            theCellEndAddress = this.getCellEndAddress();
            strategy.appendField(locator, this, "cellEndAddress", buffer, theCellEndAddress);
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
            String theIMEI;
            theIMEI = this.getIMEI();
            strategy.appendField(locator, this, "imei", buffer, theIMEI);
        }
        {
            String theNote;
            theNote = this.getNote();
            strategy.appendField(locator, this, "note", buffer, theNote);
        }
        return buffer;
    }

}
