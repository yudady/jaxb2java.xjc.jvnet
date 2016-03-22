//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.03.22 於 01:32:24 PM CST 
//


package org.example.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 * 客戶個資
 * 
 * <p>CustomerInfoType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="CustomerInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Name"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="128"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BillingAddress" type="{http://www.example.org/common}AddressType"/&gt;
 *         &lt;element name="CustomerAddress" type="{http://www.example.org/common}AddressType"/&gt;
 *         &lt;element name="IDType" type="{http://www.example.org/response}IDTypeType"/&gt;
 *         &lt;element name="ID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;group ref="{http://www.example.org/response}SecondID" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.example.org/common}EmailType" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.example.org/response}GenderType"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ReqDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="StartDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="EndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.example.org/common}NoteType"/&gt;
 *         &lt;element name="VendorSpecific" type="{http://www.example.org/response}VenderSpecificType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerInfoType", propOrder = {
    "uid",
    "name",
    "billingAddress",
    "customerAddress",
    "idType",
    "id",
    "secondIDType",
    "secondID",
    "email",
    "gender",
    "birthday",
    "reqDate",
    "startDT",
    "endDT",
    "note",
    "vendorSpecific"
})
public class CustomerInfoType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "UID", required = true)
    protected String uid;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "BillingAddress", required = true)
    protected String billingAddress;
    @XmlElement(name = "CustomerAddress", required = true)
    protected String customerAddress;
    @XmlElement(name = "IDType")
    protected int idType;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "SecondIDType")
    protected Integer secondIDType;
    @XmlElement(name = "SecondID")
    protected String secondID;
    @XmlElementRef(name = "Email", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElement(name = "Gender")
    protected int gender;
    @XmlElement(name = "Birthday")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "ReqDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqDate;
    @XmlElement(name = "StartDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDT;
    @XmlElement(name = "EndDT")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDT;
    @XmlElement(name = "Note", required = true, nillable = true)
    protected String note;
    @XmlElement(name = "VendorSpecific", required = true)
    protected VenderSpecificType vendorSpecific;

    /**
     * 取得 uid 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * 設定 uid 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * 取得 name 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 設定 name 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 取得 billingAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillingAddress() {
        return billingAddress;
    }

    /**
     * 設定 billingAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillingAddress(String value) {
        this.billingAddress = value;
    }

    /**
     * 取得 customerAddress 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAddress() {
        return customerAddress;
    }

    /**
     * 設定 customerAddress 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAddress(String value) {
        this.customerAddress = value;
    }

    /**
     * 取得 idType 特性的值.
     * 
     */
    public int getIDType() {
        return idType;
    }

    /**
     * 設定 idType 特性的值.
     * 
     */
    public void setIDType(int value) {
        this.idType = value;
    }

    /**
     * 取得 id 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 設定 id 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 取得 secondIDType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSecondIDType() {
        return secondIDType;
    }

    /**
     * 設定 secondIDType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSecondIDType(Integer value) {
        this.secondIDType = value;
    }

    /**
     * 取得 secondID 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondID() {
        return secondID;
    }

    /**
     * 設定 secondID 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondID(String value) {
        this.secondID = value;
    }

    /**
     * 取得 email 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * 設定 email 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * 取得 gender 特性的值.
     * 
     */
    public int getGender() {
        return gender;
    }

    /**
     * 設定 gender 特性的值.
     * 
     */
    public void setGender(int value) {
        this.gender = value;
    }

    /**
     * 取得 birthday 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * 設定 birthday 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * 取得 reqDate 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqDate() {
        return reqDate;
    }

    /**
     * 設定 reqDate 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqDate(XMLGregorianCalendar value) {
        this.reqDate = value;
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

    /**
     * 取得 vendorSpecific 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link VenderSpecificType }
     *     
     */
    public VenderSpecificType getVendorSpecific() {
        return vendorSpecific;
    }

    /**
     * 設定 vendorSpecific 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link VenderSpecificType }
     *     
     */
    public void setVendorSpecific(VenderSpecificType value) {
        this.vendorSpecific = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CustomerInfoType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final CustomerInfoType that = ((CustomerInfoType) object);
        {
            String lhsUID;
            lhsUID = this.getUID();
            String rhsUID;
            rhsUID = that.getUID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "uid", lhsUID), LocatorUtils.property(thatLocator, "uid", rhsUID), lhsUID, rhsUID)) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName)) {
                return false;
            }
        }
        {
            String lhsBillingAddress;
            lhsBillingAddress = this.getBillingAddress();
            String rhsBillingAddress;
            rhsBillingAddress = that.getBillingAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "billingAddress", lhsBillingAddress), LocatorUtils.property(thatLocator, "billingAddress", rhsBillingAddress), lhsBillingAddress, rhsBillingAddress)) {
                return false;
            }
        }
        {
            String lhsCustomerAddress;
            lhsCustomerAddress = this.getCustomerAddress();
            String rhsCustomerAddress;
            rhsCustomerAddress = that.getCustomerAddress();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerAddress", lhsCustomerAddress), LocatorUtils.property(thatLocator, "customerAddress", rhsCustomerAddress), lhsCustomerAddress, rhsCustomerAddress)) {
                return false;
            }
        }
        {
            int lhsIDType;
            lhsIDType = this.getIDType();
            int rhsIDType;
            rhsIDType = that.getIDType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "idType", lhsIDType), LocatorUtils.property(thatLocator, "idType", rhsIDType), lhsIDType, rhsIDType)) {
                return false;
            }
        }
        {
            String lhsID;
            lhsID = this.getID();
            String rhsID;
            rhsID = that.getID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "id", lhsID), LocatorUtils.property(thatLocator, "id", rhsID), lhsID, rhsID)) {
                return false;
            }
        }
        {
            Integer lhsSecondIDType;
            lhsSecondIDType = this.getSecondIDType();
            Integer rhsSecondIDType;
            rhsSecondIDType = that.getSecondIDType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondIDType", lhsSecondIDType), LocatorUtils.property(thatLocator, "secondIDType", rhsSecondIDType), lhsSecondIDType, rhsSecondIDType)) {
                return false;
            }
        }
        {
            String lhsSecondID;
            lhsSecondID = this.getSecondID();
            String rhsSecondID;
            rhsSecondID = that.getSecondID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "secondID", lhsSecondID), LocatorUtils.property(thatLocator, "secondID", rhsSecondID), lhsSecondID, rhsSecondID)) {
                return false;
            }
        }
        {
            JAXBElement<String> lhsEmail;
            lhsEmail = this.getEmail();
            JAXBElement<String> rhsEmail;
            rhsEmail = that.getEmail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "email", lhsEmail), LocatorUtils.property(thatLocator, "email", rhsEmail), lhsEmail, rhsEmail)) {
                return false;
            }
        }
        {
            int lhsGender;
            lhsGender = this.getGender();
            int rhsGender;
            rhsGender = that.getGender();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "gender", lhsGender), LocatorUtils.property(thatLocator, "gender", rhsGender), lhsGender, rhsGender)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsBirthday;
            lhsBirthday = this.getBirthday();
            XMLGregorianCalendar rhsBirthday;
            rhsBirthday = that.getBirthday();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "birthday", lhsBirthday), LocatorUtils.property(thatLocator, "birthday", rhsBirthday), lhsBirthday, rhsBirthday)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsReqDate;
            lhsReqDate = this.getReqDate();
            XMLGregorianCalendar rhsReqDate;
            rhsReqDate = that.getReqDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqDate", lhsReqDate), LocatorUtils.property(thatLocator, "reqDate", rhsReqDate), lhsReqDate, rhsReqDate)) {
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
            String lhsNote;
            lhsNote = this.getNote();
            String rhsNote;
            rhsNote = that.getNote();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "note", lhsNote), LocatorUtils.property(thatLocator, "note", rhsNote), lhsNote, rhsNote)) {
                return false;
            }
        }
        {
            VenderSpecificType lhsVendorSpecific;
            lhsVendorSpecific = this.getVendorSpecific();
            VenderSpecificType rhsVendorSpecific;
            rhsVendorSpecific = that.getVendorSpecific();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "vendorSpecific", lhsVendorSpecific), LocatorUtils.property(thatLocator, "vendorSpecific", rhsVendorSpecific), lhsVendorSpecific, rhsVendorSpecific)) {
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
            String theUID;
            theUID = this.getUID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "uid", theUID), currentHashCode, theUID);
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName);
        }
        {
            String theBillingAddress;
            theBillingAddress = this.getBillingAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "billingAddress", theBillingAddress), currentHashCode, theBillingAddress);
        }
        {
            String theCustomerAddress;
            theCustomerAddress = this.getCustomerAddress();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerAddress", theCustomerAddress), currentHashCode, theCustomerAddress);
        }
        {
            int theIDType;
            theIDType = this.getIDType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "idType", theIDType), currentHashCode, theIDType);
        }
        {
            String theID;
            theID = this.getID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "id", theID), currentHashCode, theID);
        }
        {
            Integer theSecondIDType;
            theSecondIDType = this.getSecondIDType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondIDType", theSecondIDType), currentHashCode, theSecondIDType);
        }
        {
            String theSecondID;
            theSecondID = this.getSecondID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "secondID", theSecondID), currentHashCode, theSecondID);
        }
        {
            JAXBElement<String> theEmail;
            theEmail = this.getEmail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "email", theEmail), currentHashCode, theEmail);
        }
        {
            int theGender;
            theGender = this.getGender();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "gender", theGender), currentHashCode, theGender);
        }
        {
            XMLGregorianCalendar theBirthday;
            theBirthday = this.getBirthday();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "birthday", theBirthday), currentHashCode, theBirthday);
        }
        {
            XMLGregorianCalendar theReqDate;
            theReqDate = this.getReqDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqDate", theReqDate), currentHashCode, theReqDate);
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
            String theNote;
            theNote = this.getNote();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "note", theNote), currentHashCode, theNote);
        }
        {
            VenderSpecificType theVendorSpecific;
            theVendorSpecific = this.getVendorSpecific();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "vendorSpecific", theVendorSpecific), currentHashCode, theVendorSpecific);
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
            String theUID;
            theUID = this.getUID();
            strategy.appendField(locator, this, "uid", buffer, theUID);
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            String theBillingAddress;
            theBillingAddress = this.getBillingAddress();
            strategy.appendField(locator, this, "billingAddress", buffer, theBillingAddress);
        }
        {
            String theCustomerAddress;
            theCustomerAddress = this.getCustomerAddress();
            strategy.appendField(locator, this, "customerAddress", buffer, theCustomerAddress);
        }
        {
            int theIDType;
            theIDType = this.getIDType();
            strategy.appendField(locator, this, "idType", buffer, theIDType);
        }
        {
            String theID;
            theID = this.getID();
            strategy.appendField(locator, this, "id", buffer, theID);
        }
        {
            Integer theSecondIDType;
            theSecondIDType = this.getSecondIDType();
            strategy.appendField(locator, this, "secondIDType", buffer, theSecondIDType);
        }
        {
            String theSecondID;
            theSecondID = this.getSecondID();
            strategy.appendField(locator, this, "secondID", buffer, theSecondID);
        }
        {
            JAXBElement<String> theEmail;
            theEmail = this.getEmail();
            strategy.appendField(locator, this, "email", buffer, theEmail);
        }
        {
            int theGender;
            theGender = this.getGender();
            strategy.appendField(locator, this, "gender", buffer, theGender);
        }
        {
            XMLGregorianCalendar theBirthday;
            theBirthday = this.getBirthday();
            strategy.appendField(locator, this, "birthday", buffer, theBirthday);
        }
        {
            XMLGregorianCalendar theReqDate;
            theReqDate = this.getReqDate();
            strategy.appendField(locator, this, "reqDate", buffer, theReqDate);
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
            String theNote;
            theNote = this.getNote();
            strategy.appendField(locator, this, "note", buffer, theNote);
        }
        {
            VenderSpecificType theVendorSpecific;
            theVendorSpecific = this.getVendorSpecific();
            strategy.appendField(locator, this, "vendorSpecific", buffer, theVendorSpecific);
        }
        return buffer;
    }

}
