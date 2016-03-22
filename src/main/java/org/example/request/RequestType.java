//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.03.22 於 01:32:24 PM CST 
//


package org.example.request;

import java.util.ArrayList;
import java.util.List;
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
 * 調閱請求
 * 
 * <p>RequestType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReqDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DocNo" type="{http://www.example.org/common}DocNoType"/&gt;
 *         &lt;element name="Law"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Branch"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Usage"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ContactTel" type="{http://www.example.org/common}PhoneNumType"/&gt;
 *         &lt;element name="ContactMail" type="{http://www.example.org/common}EmailType"/&gt;
 *         &lt;element name="DocDescription" type="{http://www.example.org/common}NoteType"/&gt;
 *         &lt;element name="ReqStartDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReqEndDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Realtime"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="-1"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Record" type="{http://www.example.org/request}RecordType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "reqDT",
    "docNo",
    "law",
    "branch",
    "usage",
    "contactName",
    "contactTel",
    "contactMail",
    "docDescription",
    "reqStartDT",
    "reqEndDT",
    "realtime",
    "record"
})
public class RequestType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ReqDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqDT;
    @XmlElement(name = "DocNo", required = true)
    protected String docNo;
    @XmlElement(name = "Law", required = true)
    protected String law;
    @XmlElement(name = "Branch", required = true)
    protected String branch;
    @XmlElement(name = "Usage", required = true)
    protected String usage;
    @XmlElement(name = "ContactName", required = true)
    protected String contactName;
    @XmlElement(name = "ContactTel", required = true)
    protected String contactTel;
    @XmlElement(name = "ContactMail", required = true)
    protected String contactMail;
    @XmlElement(name = "DocDescription", required = true)
    protected String docDescription;
    @XmlElement(name = "ReqStartDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqStartDT;
    @XmlElement(name = "ReqEndDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqEndDT;
    @XmlElement(name = "Realtime")
    protected int realtime;
    @XmlElement(name = "Record", required = true)
    protected List<RecordType> record;

    /**
     * 取得 reqDT 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqDT() {
        return reqDT;
    }

    /**
     * 設定 reqDT 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqDT(XMLGregorianCalendar value) {
        this.reqDT = value;
    }

    /**
     * 取得 docNo 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNo() {
        return docNo;
    }

    /**
     * 設定 docNo 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNo(String value) {
        this.docNo = value;
    }

    /**
     * 取得 law 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLaw() {
        return law;
    }

    /**
     * 設定 law 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLaw(String value) {
        this.law = value;
    }

    /**
     * 取得 branch 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranch() {
        return branch;
    }

    /**
     * 設定 branch 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranch(String value) {
        this.branch = value;
    }

    /**
     * 取得 usage 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsage() {
        return usage;
    }

    /**
     * 設定 usage 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsage(String value) {
        this.usage = value;
    }

    /**
     * 取得 contactName 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * 設定 contactName 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * 取得 contactTel 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * 設定 contactTel 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTel(String value) {
        this.contactTel = value;
    }

    /**
     * 取得 contactMail 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMail() {
        return contactMail;
    }

    /**
     * 設定 contactMail 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMail(String value) {
        this.contactMail = value;
    }

    /**
     * 取得 docDescription 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocDescription() {
        return docDescription;
    }

    /**
     * 設定 docDescription 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocDescription(String value) {
        this.docDescription = value;
    }

    /**
     * 取得 reqStartDT 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqStartDT() {
        return reqStartDT;
    }

    /**
     * 設定 reqStartDT 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqStartDT(XMLGregorianCalendar value) {
        this.reqStartDT = value;
    }

    /**
     * 取得 reqEndDT 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqEndDT() {
        return reqEndDT;
    }

    /**
     * 設定 reqEndDT 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqEndDT(XMLGregorianCalendar value) {
        this.reqEndDT = value;
    }

    /**
     * 取得 realtime 特性的值.
     * 
     */
    public int getRealtime() {
        return realtime;
    }

    /**
     * 設定 realtime 特性的值.
     * 
     */
    public void setRealtime(int value) {
        this.realtime = value;
    }

    /**
     * Gets the value of the record property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the record property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordType }
     * 
     * 
     */
    public List<RecordType> getRecord() {
        if (record == null) {
            record = new ArrayList<RecordType>();
        }
        return this.record;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RequestType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final RequestType that = ((RequestType) object);
        {
            XMLGregorianCalendar lhsReqDT;
            lhsReqDT = this.getReqDT();
            XMLGregorianCalendar rhsReqDT;
            rhsReqDT = that.getReqDT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqDT", lhsReqDT), LocatorUtils.property(thatLocator, "reqDT", rhsReqDT), lhsReqDT, rhsReqDT)) {
                return false;
            }
        }
        {
            String lhsDocNo;
            lhsDocNo = this.getDocNo();
            String rhsDocNo;
            rhsDocNo = that.getDocNo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "docNo", lhsDocNo), LocatorUtils.property(thatLocator, "docNo", rhsDocNo), lhsDocNo, rhsDocNo)) {
                return false;
            }
        }
        {
            String lhsLaw;
            lhsLaw = this.getLaw();
            String rhsLaw;
            rhsLaw = that.getLaw();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "law", lhsLaw), LocatorUtils.property(thatLocator, "law", rhsLaw), lhsLaw, rhsLaw)) {
                return false;
            }
        }
        {
            String lhsBranch;
            lhsBranch = this.getBranch();
            String rhsBranch;
            rhsBranch = that.getBranch();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branch", lhsBranch), LocatorUtils.property(thatLocator, "branch", rhsBranch), lhsBranch, rhsBranch)) {
                return false;
            }
        }
        {
            String lhsUsage;
            lhsUsage = this.getUsage();
            String rhsUsage;
            rhsUsage = that.getUsage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "usage", lhsUsage), LocatorUtils.property(thatLocator, "usage", rhsUsage), lhsUsage, rhsUsage)) {
                return false;
            }
        }
        {
            String lhsContactName;
            lhsContactName = this.getContactName();
            String rhsContactName;
            rhsContactName = that.getContactName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactName", lhsContactName), LocatorUtils.property(thatLocator, "contactName", rhsContactName), lhsContactName, rhsContactName)) {
                return false;
            }
        }
        {
            String lhsContactTel;
            lhsContactTel = this.getContactTel();
            String rhsContactTel;
            rhsContactTel = that.getContactTel();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactTel", lhsContactTel), LocatorUtils.property(thatLocator, "contactTel", rhsContactTel), lhsContactTel, rhsContactTel)) {
                return false;
            }
        }
        {
            String lhsContactMail;
            lhsContactMail = this.getContactMail();
            String rhsContactMail;
            rhsContactMail = that.getContactMail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contactMail", lhsContactMail), LocatorUtils.property(thatLocator, "contactMail", rhsContactMail), lhsContactMail, rhsContactMail)) {
                return false;
            }
        }
        {
            String lhsDocDescription;
            lhsDocDescription = this.getDocDescription();
            String rhsDocDescription;
            rhsDocDescription = that.getDocDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "docDescription", lhsDocDescription), LocatorUtils.property(thatLocator, "docDescription", rhsDocDescription), lhsDocDescription, rhsDocDescription)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsReqStartDT;
            lhsReqStartDT = this.getReqStartDT();
            XMLGregorianCalendar rhsReqStartDT;
            rhsReqStartDT = that.getReqStartDT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqStartDT", lhsReqStartDT), LocatorUtils.property(thatLocator, "reqStartDT", rhsReqStartDT), lhsReqStartDT, rhsReqStartDT)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsReqEndDT;
            lhsReqEndDT = this.getReqEndDT();
            XMLGregorianCalendar rhsReqEndDT;
            rhsReqEndDT = that.getReqEndDT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reqEndDT", lhsReqEndDT), LocatorUtils.property(thatLocator, "reqEndDT", rhsReqEndDT), lhsReqEndDT, rhsReqEndDT)) {
                return false;
            }
        }
        {
            int lhsRealtime;
            lhsRealtime = this.getRealtime();
            int rhsRealtime;
            rhsRealtime = that.getRealtime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "realtime", lhsRealtime), LocatorUtils.property(thatLocator, "realtime", rhsRealtime), lhsRealtime, rhsRealtime)) {
                return false;
            }
        }
        {
            List<RecordType> lhsRecord;
            lhsRecord = (((this.record!= null)&&(!this.record.isEmpty()))?this.getRecord():null);
            List<RecordType> rhsRecord;
            rhsRecord = (((that.record!= null)&&(!that.record.isEmpty()))?that.getRecord():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "record", lhsRecord), LocatorUtils.property(thatLocator, "record", rhsRecord), lhsRecord, rhsRecord)) {
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
            XMLGregorianCalendar theReqDT;
            theReqDT = this.getReqDT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqDT", theReqDT), currentHashCode, theReqDT);
        }
        {
            String theDocNo;
            theDocNo = this.getDocNo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "docNo", theDocNo), currentHashCode, theDocNo);
        }
        {
            String theLaw;
            theLaw = this.getLaw();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "law", theLaw), currentHashCode, theLaw);
        }
        {
            String theBranch;
            theBranch = this.getBranch();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "branch", theBranch), currentHashCode, theBranch);
        }
        {
            String theUsage;
            theUsage = this.getUsage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "usage", theUsage), currentHashCode, theUsage);
        }
        {
            String theContactName;
            theContactName = this.getContactName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactName", theContactName), currentHashCode, theContactName);
        }
        {
            String theContactTel;
            theContactTel = this.getContactTel();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactTel", theContactTel), currentHashCode, theContactTel);
        }
        {
            String theContactMail;
            theContactMail = this.getContactMail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contactMail", theContactMail), currentHashCode, theContactMail);
        }
        {
            String theDocDescription;
            theDocDescription = this.getDocDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "docDescription", theDocDescription), currentHashCode, theDocDescription);
        }
        {
            XMLGregorianCalendar theReqStartDT;
            theReqStartDT = this.getReqStartDT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqStartDT", theReqStartDT), currentHashCode, theReqStartDT);
        }
        {
            XMLGregorianCalendar theReqEndDT;
            theReqEndDT = this.getReqEndDT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reqEndDT", theReqEndDT), currentHashCode, theReqEndDT);
        }
        {
            int theRealtime;
            theRealtime = this.getRealtime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "realtime", theRealtime), currentHashCode, theRealtime);
        }
        {
            List<RecordType> theRecord;
            theRecord = (((this.record!= null)&&(!this.record.isEmpty()))?this.getRecord():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "record", theRecord), currentHashCode, theRecord);
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
            XMLGregorianCalendar theReqDT;
            theReqDT = this.getReqDT();
            strategy.appendField(locator, this, "reqDT", buffer, theReqDT);
        }
        {
            String theDocNo;
            theDocNo = this.getDocNo();
            strategy.appendField(locator, this, "docNo", buffer, theDocNo);
        }
        {
            String theLaw;
            theLaw = this.getLaw();
            strategy.appendField(locator, this, "law", buffer, theLaw);
        }
        {
            String theBranch;
            theBranch = this.getBranch();
            strategy.appendField(locator, this, "branch", buffer, theBranch);
        }
        {
            String theUsage;
            theUsage = this.getUsage();
            strategy.appendField(locator, this, "usage", buffer, theUsage);
        }
        {
            String theContactName;
            theContactName = this.getContactName();
            strategy.appendField(locator, this, "contactName", buffer, theContactName);
        }
        {
            String theContactTel;
            theContactTel = this.getContactTel();
            strategy.appendField(locator, this, "contactTel", buffer, theContactTel);
        }
        {
            String theContactMail;
            theContactMail = this.getContactMail();
            strategy.appendField(locator, this, "contactMail", buffer, theContactMail);
        }
        {
            String theDocDescription;
            theDocDescription = this.getDocDescription();
            strategy.appendField(locator, this, "docDescription", buffer, theDocDescription);
        }
        {
            XMLGregorianCalendar theReqStartDT;
            theReqStartDT = this.getReqStartDT();
            strategy.appendField(locator, this, "reqStartDT", buffer, theReqStartDT);
        }
        {
            XMLGregorianCalendar theReqEndDT;
            theReqEndDT = this.getReqEndDT();
            strategy.appendField(locator, this, "reqEndDT", buffer, theReqEndDT);
        }
        {
            int theRealtime;
            theRealtime = this.getRealtime();
            strategy.appendField(locator, this, "realtime", buffer, theRealtime);
        }
        {
            List<RecordType> theRecord;
            theRecord = (((this.record!= null)&&(!this.record.isEmpty()))?this.getRecord():null);
            strategy.appendField(locator, this, "record", buffer, theRecord);
        }
        return buffer;
    }

}
