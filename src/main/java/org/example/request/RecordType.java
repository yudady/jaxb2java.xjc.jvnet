//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.03.22 於 01:32:24 PM CST 
//


package org.example.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.example.common.DataExpectedType;
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
 * 請求的調閱資料
 * 
 * <p>RecordType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="RecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.example.org/common}RecordType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.example.org/request}OriginTarget" minOccurs="0"/&gt;
 *         &lt;element name="DataExpectedType" type="{http://www.example.org/common}DataExpectedType" minOccurs="0"/&gt;
 *         &lt;element name="Notify"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;enumeration value="-1"/&gt;
 *               &lt;enumeration value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordType", propOrder = {
    "originType",
    "originObj",
    "dataExpectedType",
    "notify"
})
public class RecordType
    extends org.example.common.RecordType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "OriginType")
    protected Integer originType;
    @XmlElement(name = "OriginObj")
    protected String originObj;
    @XmlElement(name = "DataExpectedType")
    @XmlSchemaType(name = "string")
    protected DataExpectedType dataExpectedType;
    @XmlElement(name = "Notify")
    protected int notify;

    /**
     * 取得 originType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOriginType() {
        return originType;
    }

    /**
     * 設定 originType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOriginType(Integer value) {
        this.originType = value;
    }

    /**
     * 取得 originObj 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginObj() {
        return originObj;
    }

    /**
     * 設定 originObj 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginObj(String value) {
        this.originObj = value;
    }

    /**
     * 取得 dataExpectedType 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link DataExpectedType }
     *     
     */
    public DataExpectedType getDataExpectedType() {
        return dataExpectedType;
    }

    /**
     * 設定 dataExpectedType 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link DataExpectedType }
     *     
     */
    public void setDataExpectedType(DataExpectedType value) {
        this.dataExpectedType = value;
    }

    /**
     * 取得 notify 特性的值.
     * 
     */
    public int getNotify() {
        return notify;
    }

    /**
     * 設定 notify 特性的值.
     * 
     */
    public void setNotify(int value) {
        this.notify = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RecordType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RecordType that = ((RecordType) object);
        {
            Integer lhsOriginType;
            lhsOriginType = this.getOriginType();
            Integer rhsOriginType;
            rhsOriginType = that.getOriginType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originType", lhsOriginType), LocatorUtils.property(thatLocator, "originType", rhsOriginType), lhsOriginType, rhsOriginType)) {
                return false;
            }
        }
        {
            String lhsOriginObj;
            lhsOriginObj = this.getOriginObj();
            String rhsOriginObj;
            rhsOriginObj = that.getOriginObj();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originObj", lhsOriginObj), LocatorUtils.property(thatLocator, "originObj", rhsOriginObj), lhsOriginObj, rhsOriginObj)) {
                return false;
            }
        }
        {
            DataExpectedType lhsDataExpectedType;
            lhsDataExpectedType = this.getDataExpectedType();
            DataExpectedType rhsDataExpectedType;
            rhsDataExpectedType = that.getDataExpectedType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dataExpectedType", lhsDataExpectedType), LocatorUtils.property(thatLocator, "dataExpectedType", rhsDataExpectedType), lhsDataExpectedType, rhsDataExpectedType)) {
                return false;
            }
        }
        {
            int lhsNotify;
            lhsNotify = this.getNotify();
            int rhsNotify;
            rhsNotify = that.getNotify();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "notify", lhsNotify), LocatorUtils.property(thatLocator, "notify", rhsNotify), lhsNotify, rhsNotify)) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            Integer theOriginType;
            theOriginType = this.getOriginType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originType", theOriginType), currentHashCode, theOriginType);
        }
        {
            String theOriginObj;
            theOriginObj = this.getOriginObj();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originObj", theOriginObj), currentHashCode, theOriginObj);
        }
        {
            DataExpectedType theDataExpectedType;
            theDataExpectedType = this.getDataExpectedType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dataExpectedType", theDataExpectedType), currentHashCode, theDataExpectedType);
        }
        {
            int theNotify;
            theNotify = this.getNotify();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "notify", theNotify), currentHashCode, theNotify);
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
        super.appendFields(locator, buffer, strategy);
        {
            Integer theOriginType;
            theOriginType = this.getOriginType();
            strategy.appendField(locator, this, "originType", buffer, theOriginType);
        }
        {
            String theOriginObj;
            theOriginObj = this.getOriginObj();
            strategy.appendField(locator, this, "originObj", buffer, theOriginObj);
        }
        {
            DataExpectedType theDataExpectedType;
            theDataExpectedType = this.getDataExpectedType();
            strategy.appendField(locator, this, "dataExpectedType", buffer, theDataExpectedType);
        }
        {
            int theNotify;
            theNotify = this.getNotify();
            strategy.appendField(locator, this, "notify", buffer, theNotify);
        }
        return buffer;
    }

}
