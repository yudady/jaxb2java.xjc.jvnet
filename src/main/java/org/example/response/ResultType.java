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
import javax.xml.bind.annotation.XmlElements;
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
 * 查詢結果
 * 
 * <p>ResultType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="ResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerInfo" type="{http://www.example.org/response}CustomerInfoType"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="CellInfo" type="{http://www.example.org/response}CellInfoType"/&gt;
 *           &lt;element name="WiFiInfo" type="{http://www.example.org/response}WiFiInfoType"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultType", propOrder = {
    "customerInfo",
    "cellInfoOrWiFiInfo"
})
public class ResultType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "CustomerInfo", required = true)
    protected CustomerInfoType customerInfo;
    @XmlElements({
        @XmlElement(name = "CellInfo", type = CellInfoType.class),
        @XmlElement(name = "WiFiInfo", type = WiFiInfoType.class)
    })
    protected List<Object> cellInfoOrWiFiInfo;

    /**
     * 取得 customerInfo 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInfoType }
     *     
     */
    public CustomerInfoType getCustomerInfo() {
        return customerInfo;
    }

    /**
     * 設定 customerInfo 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInfoType }
     *     
     */
    public void setCustomerInfo(CustomerInfoType value) {
        this.customerInfo = value;
    }

    /**
     * Gets the value of the cellInfoOrWiFiInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cellInfoOrWiFiInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCellInfoOrWiFiInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellInfoType }
     * {@link WiFiInfoType }
     * 
     * 
     */
    public List<Object> getCellInfoOrWiFiInfo() {
        if (cellInfoOrWiFiInfo == null) {
            cellInfoOrWiFiInfo = new ArrayList<Object>();
        }
        return this.cellInfoOrWiFiInfo;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ResultType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ResultType that = ((ResultType) object);
        {
            CustomerInfoType lhsCustomerInfo;
            lhsCustomerInfo = this.getCustomerInfo();
            CustomerInfoType rhsCustomerInfo;
            rhsCustomerInfo = that.getCustomerInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "customerInfo", lhsCustomerInfo), LocatorUtils.property(thatLocator, "customerInfo", rhsCustomerInfo), lhsCustomerInfo, rhsCustomerInfo)) {
                return false;
            }
        }
        {
            List<Object> lhsCellInfoOrWiFiInfo;
            lhsCellInfoOrWiFiInfo = (((this.cellInfoOrWiFiInfo!= null)&&(!this.cellInfoOrWiFiInfo.isEmpty()))?this.getCellInfoOrWiFiInfo():null);
            List<Object> rhsCellInfoOrWiFiInfo;
            rhsCellInfoOrWiFiInfo = (((that.cellInfoOrWiFiInfo!= null)&&(!that.cellInfoOrWiFiInfo.isEmpty()))?that.getCellInfoOrWiFiInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "cellInfoOrWiFiInfo", lhsCellInfoOrWiFiInfo), LocatorUtils.property(thatLocator, "cellInfoOrWiFiInfo", rhsCellInfoOrWiFiInfo), lhsCellInfoOrWiFiInfo, rhsCellInfoOrWiFiInfo)) {
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
            CustomerInfoType theCustomerInfo;
            theCustomerInfo = this.getCustomerInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "customerInfo", theCustomerInfo), currentHashCode, theCustomerInfo);
        }
        {
            List<Object> theCellInfoOrWiFiInfo;
            theCellInfoOrWiFiInfo = (((this.cellInfoOrWiFiInfo!= null)&&(!this.cellInfoOrWiFiInfo.isEmpty()))?this.getCellInfoOrWiFiInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "cellInfoOrWiFiInfo", theCellInfoOrWiFiInfo), currentHashCode, theCellInfoOrWiFiInfo);
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
            CustomerInfoType theCustomerInfo;
            theCustomerInfo = this.getCustomerInfo();
            strategy.appendField(locator, this, "customerInfo", buffer, theCustomerInfo);
        }
        {
            List<Object> theCellInfoOrWiFiInfo;
            theCellInfoOrWiFiInfo = (((this.cellInfoOrWiFiInfo!= null)&&(!this.cellInfoOrWiFiInfo.isEmpty()))?this.getCellInfoOrWiFiInfo():null);
            strategy.appendField(locator, this, "cellInfoOrWiFiInfo", buffer, theCellInfoOrWiFiInfo);
        }
        return buffer;
    }

}
