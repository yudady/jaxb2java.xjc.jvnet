//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.03.22 於 01:32:24 PM CST 
//


package org.example.response;

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
 * 資料回覆
 * 
 * <p>ResponseType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Status" type="{http://www.example.org/response}StatusType"/&gt;
 *         &lt;element name="ResDT" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="DocNo" type="{http://www.example.org/common}DocNoType"/&gt;
 *         &lt;element name="Comment" type="{http://www.example.org/common}NoteType"/&gt;
 *         &lt;element name="Record" type="{http://www.example.org/response}RecordType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "status",
    "resDT",
    "docNo",
    "comment",
    "record"
})
public class ResponseType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Status")
    protected int status;
    @XmlElement(name = "ResDT", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar resDT;
    @XmlElement(name = "DocNo", required = true)
    protected String docNo;
    @XmlElement(name = "Comment", required = true)
    protected String comment;
    @XmlElement(name = "Record", required = true)
    protected List<RecordType> record;

    /**
     * 取得 status 特性的值.
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * 設定 status 特性的值.
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * 取得 resDT 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResDT() {
        return resDT;
    }

    /**
     * 設定 resDT 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResDT(XMLGregorianCalendar value) {
        this.resDT = value;
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
     * 取得 comment 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * 設定 comment 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
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
        if (!(object instanceof ResponseType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ResponseType that = ((ResponseType) object);
        {
            int lhsStatus;
            lhsStatus = this.getStatus();
            int rhsStatus;
            rhsStatus = that.getStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsResDT;
            lhsResDT = this.getResDT();
            XMLGregorianCalendar rhsResDT;
            rhsResDT = that.getResDT();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "resDT", lhsResDT), LocatorUtils.property(thatLocator, "resDT", rhsResDT), lhsResDT, rhsResDT)) {
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
            String lhsComment;
            lhsComment = this.getComment();
            String rhsComment;
            rhsComment = that.getComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment)) {
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
            int theStatus;
            theStatus = this.getStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus);
        }
        {
            XMLGregorianCalendar theResDT;
            theResDT = this.getResDT();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "resDT", theResDT), currentHashCode, theResDT);
        }
        {
            String theDocNo;
            theDocNo = this.getDocNo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "docNo", theDocNo), currentHashCode, theDocNo);
        }
        {
            String theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment);
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
            int theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            XMLGregorianCalendar theResDT;
            theResDT = this.getResDT();
            strategy.appendField(locator, this, "resDT", buffer, theResDT);
        }
        {
            String theDocNo;
            theDocNo = this.getDocNo();
            strategy.appendField(locator, this, "docNo", buffer, theDocNo);
        }
        {
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment);
        }
        {
            List<RecordType> theRecord;
            theRecord = (((this.record!= null)&&(!this.record.isEmpty()))?this.getRecord():null);
            strategy.appendField(locator, this, "record", buffer, theRecord);
        }
        return buffer;
    }

}
