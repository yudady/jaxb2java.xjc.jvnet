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
 * <p>WiFiInfoType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="WiFiInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WiFiApInfo" type="{http://www.example.org/response}WiFiApInfoType"/&gt;
 *         &lt;element name="WiFiAccessInfo" type="{http://www.example.org/response}WiFiAccessInfoType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WiFiInfoType", propOrder = {
    "wiFiApInfo",
    "wiFiAccessInfo"
})
public class WiFiInfoType implements Equals, HashCode, ToString
{

    @XmlElement(name = "WiFiApInfo", required = true)
    protected WiFiApInfoType wiFiApInfo;
    @XmlElement(name = "WiFiAccessInfo", required = true)
    protected List<WiFiAccessInfoType> wiFiAccessInfo;

    /**
     * 取得 wiFiApInfo 特性的值.
     * 
     * @return
     *     possible object is
     *     {@link WiFiApInfoType }
     *     
     */
    public WiFiApInfoType getWiFiApInfo() {
        return wiFiApInfo;
    }

    /**
     * 設定 wiFiApInfo 特性的值.
     * 
     * @param value
     *     allowed object is
     *     {@link WiFiApInfoType }
     *     
     */
    public void setWiFiApInfo(WiFiApInfoType value) {
        this.wiFiApInfo = value;
    }

    /**
     * Gets the value of the wiFiAccessInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wiFiAccessInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWiFiAccessInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WiFiAccessInfoType }
     * 
     * 
     */
    public List<WiFiAccessInfoType> getWiFiAccessInfo() {
        if (wiFiAccessInfo == null) {
            wiFiAccessInfo = new ArrayList<WiFiAccessInfoType>();
        }
        return this.wiFiAccessInfo;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WiFiInfoType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WiFiInfoType that = ((WiFiInfoType) object);
        {
            WiFiApInfoType lhsWiFiApInfo;
            lhsWiFiApInfo = this.getWiFiApInfo();
            WiFiApInfoType rhsWiFiApInfo;
            rhsWiFiApInfo = that.getWiFiApInfo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiFiApInfo", lhsWiFiApInfo), LocatorUtils.property(thatLocator, "wiFiApInfo", rhsWiFiApInfo), lhsWiFiApInfo, rhsWiFiApInfo)) {
                return false;
            }
        }
        {
            List<WiFiAccessInfoType> lhsWiFiAccessInfo;
            lhsWiFiAccessInfo = (((this.wiFiAccessInfo!= null)&&(!this.wiFiAccessInfo.isEmpty()))?this.getWiFiAccessInfo():null);
            List<WiFiAccessInfoType> rhsWiFiAccessInfo;
            rhsWiFiAccessInfo = (((that.wiFiAccessInfo!= null)&&(!that.wiFiAccessInfo.isEmpty()))?that.getWiFiAccessInfo():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "wiFiAccessInfo", lhsWiFiAccessInfo), LocatorUtils.property(thatLocator, "wiFiAccessInfo", rhsWiFiAccessInfo), lhsWiFiAccessInfo, rhsWiFiAccessInfo)) {
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
            WiFiApInfoType theWiFiApInfo;
            theWiFiApInfo = this.getWiFiApInfo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wiFiApInfo", theWiFiApInfo), currentHashCode, theWiFiApInfo);
        }
        {
            List<WiFiAccessInfoType> theWiFiAccessInfo;
            theWiFiAccessInfo = (((this.wiFiAccessInfo!= null)&&(!this.wiFiAccessInfo.isEmpty()))?this.getWiFiAccessInfo():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "wiFiAccessInfo", theWiFiAccessInfo), currentHashCode, theWiFiAccessInfo);
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
            WiFiApInfoType theWiFiApInfo;
            theWiFiApInfo = this.getWiFiApInfo();
            strategy.appendField(locator, this, "wiFiApInfo", buffer, theWiFiApInfo);
        }
        {
            List<WiFiAccessInfoType> theWiFiAccessInfo;
            theWiFiAccessInfo = (((this.wiFiAccessInfo!= null)&&(!this.wiFiAccessInfo.isEmpty()))?this.getWiFiAccessInfo():null);
            strategy.appendField(locator, this, "wiFiAccessInfo", buffer, theWiFiAccessInfo);
        }
        return buffer;
    }

}
