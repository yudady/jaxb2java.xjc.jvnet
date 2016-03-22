//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.03.22 於 01:32:24 PM CST 
//


package org.example.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
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
 * 調閱資料
 * 
 * <p>RecordType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="RecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ObjectType" type="{http://www.example.org/common}ObjectTypeType"/&gt;
 *         &lt;element name="Object"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StartDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="VendorType" type="{http://www.example.org/common}VendorTypeType"/&gt;
 *         &lt;element name="VendorName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Seq" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordType", propOrder = {
    "objectType",
    "object",
    "startDT",
    "endDT",
    "vendorType",
    "vendorName"
})
@XmlSeeAlso({
    org.example.request.RecordType.class,
    org.example.response.RecordType.class
})
public class RecordType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ObjectType")
    protected int objectType;
    @XmlElement(name = "Object", required = true)
    protected String object;
    @XmlElement(name = "StartDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDT;
    @XmlElement(name = "EndDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDT;
    @XmlElement(name = "VendorType", required = true)
    protected String vendorType;
    @XmlElement(name = "VendorName", required = true)
    protected String vendorName;
    @XmlAttribute(name = "Seq", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger seq;

    /**
     * 取得 objectType 特性的值.
     * 
     */
    public int getObjectType() {
        return objectType;
    }

    /**
     * 設定 objectType 特性的值.
     * 
     */
    public void setObjectType(int value) {
        this.objectType = value;
    }

    /**
     * 取得 object 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObject() {
        return object;
    }

    /**
     * 設定 object 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObject(String value) {
        this.object = value;
    }

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
     * 取得 vendorType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorType() {
        return vendorType;
    }

    /**
     * 設定 vendorType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorType(String value) {
        this.vendorType = value;
    }

    /**
     * 取得 vendorName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorName() {
        return vendorName;
    }

    /**
     * 設定 vendorName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorName(String value) {
        this.vendorName = value;
    }

    /**
     * 取得 seq 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * 設定 seq 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RecordType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RecordType that = ((RecordType) object);
        {
            int lhsObjectType;
            lhsObjectType = this.getObjectType();
            int rhsObjectType;
            rhsObjectType = that.getObjectType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "objectType", lhsObjectType), LocatorUtils.property(thatLocator, "objectType", rhsObjectType), lhsObjectType, rhsObjectType)) {
                return false;
            }
        }
        {
            String lhsObject;
            lhsObject = this.getObject();
            String rhsObject;
            rhsObject = that.getObject();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "object", lhsObject), LocatorUtils.property(thatLocator, "object", rhsObject), lhsObject, rhsObject)) {
                return false;
            }
        }
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
            XMLGregorianCalendar lhsEndDT;
            lhsEndDT = this.getEndDT();
            XMLGregorianCalendar rhsEndDT;
            rhsEndDT = that.getEndDT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endDT", lhsEndDT), LocatorUtils.property(thatLocator, "endDT", rhsEndDT), lhsEndDT, rhsEndDT)) {
                return false;
            }
        }
        {
            String lhsVendorType;
            lhsVendorType = this.getVendorType();
            String rhsVendorType;
            rhsVendorType = that.getVendorType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorType", lhsVendorType), LocatorUtils.property(thatLocator, "vendorType", rhsVendorType), lhsVendorType, rhsVendorType)) {
                return false;
            }
        }
        {
            String lhsVendorName;
            lhsVendorName = this.getVendorName();
            String rhsVendorName;
            rhsVendorName = that.getVendorName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorName", lhsVendorName), LocatorUtils.property(thatLocator, "vendorName", rhsVendorName), lhsVendorName, rhsVendorName)) {
                return false;
            }
        }
        {
            BigInteger lhsSeq;
            lhsSeq = this.getSeq();
            BigInteger rhsSeq;
            rhsSeq = that.getSeq();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "seq", lhsSeq), LocatorUtils.property(thatLocator, "seq", rhsSeq), lhsSeq, rhsSeq)) {
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
            int theObjectType;
            theObjectType = this.getObjectType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "objectType", theObjectType), currentHashCode, theObjectType);
        }
        {
            String theObject;
            theObject = this.getObject();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "object", theObject), currentHashCode, theObject);
        }
        {
            XMLGregorianCalendar theStartDT;
            theStartDT = this.getStartDT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startDT", theStartDT), currentHashCode, theStartDT);
        }
        {
            XMLGregorianCalendar theEndDT;
            theEndDT = this.getEndDT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endDT", theEndDT), currentHashCode, theEndDT);
        }
        {
            String theVendorType;
            theVendorType = this.getVendorType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorType", theVendorType), currentHashCode, theVendorType);
        }
        {
            String theVendorName;
            theVendorName = this.getVendorName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorName", theVendorName), currentHashCode, theVendorName);
        }
        {
            BigInteger theSeq;
            theSeq = this.getSeq();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "seq", theSeq), currentHashCode, theSeq);
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
            int theObjectType;
            theObjectType = this.getObjectType();
            strategy.appendField(locator, this, "objectType", buffer, theObjectType);
        }
        {
            String theObject;
            theObject = this.getObject();
            strategy.appendField(locator, this, "object", buffer, theObject);
        }
        {
            XMLGregorianCalendar theStartDT;
            theStartDT = this.getStartDT();
            strategy.appendField(locator, this, "startDT", buffer, theStartDT);
        }
        {
            XMLGregorianCalendar theEndDT;
            theEndDT = this.getEndDT();
            strategy.appendField(locator, this, "endDT", buffer, theEndDT);
        }
        {
            String theVendorType;
            theVendorType = this.getVendorType();
            strategy.appendField(locator, this, "vendorType", buffer, theVendorType);
        }
        {
            String theVendorName;
            theVendorName = this.getVendorName();
            strategy.appendField(locator, this, "vendorName", buffer, theVendorName);
        }
        {
            BigInteger theSeq;
            theSeq = this.getSeq();
            strategy.appendField(locator, this, "seq", buffer, theSeq);
        }
        return buffer;
    }

}
