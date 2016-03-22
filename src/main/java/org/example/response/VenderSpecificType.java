//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.03.22 於 01:32:24 PM CST 
//


package org.example.response;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 * Vendor specific Customer Information Data
 * 
 * <p>VenderSpecificType complex type 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * 
 * <pre>
 * &lt;complexType name="VenderSpecificType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;group ref="{http://www.example.org/response}VendorSpecificFixNetwork"/&gt;
 *         &lt;group ref="{http://www.example.org/response}VendorSpecific3G"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VenderSpecificType", propOrder = {
    "content"
})
public class VenderSpecificType
    implements Equals, HashCode, ToString
{

    @XmlElementRefs({
        @XmlElementRef(name = "Usage", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Contact", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DedicatedLine", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "LANIP", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "WANIP", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "MSISDN", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AttachNumber", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "InstallAddress", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ServiceType", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Category", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "Phone", namespace = "http://www.example.org/response", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<String>> content;

    /**
     * 取得其餘的內容模型. 
     * 
     * <p>
     * 基於下列原因, 您取得此 "catch-all" 特性: 
     * 綱要的兩個不同部分均使用欄位名稱 "Phone". 請參閱: 
     * file:/F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/responseCSP.xsd 的第 356 行
     * file:/F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/responseCSP.xsd 的第 322 行
     * <p>
     * 為去除此特性, 請將特性自訂項目套用至下列兩個宣告的
     * 其中之一, 以變更它們的名稱: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<String>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<String>>();
        }
        return this.content;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof VenderSpecificType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final VenderSpecificType that = ((VenderSpecificType) object);
        {
            List<JAXBElement<String>> lhsContent;
            lhsContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            List<JAXBElement<String>> rhsContent;
            rhsContent = (((that.content!= null)&&(!that.content.isEmpty()))?that.getContent():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "content", lhsContent), LocatorUtils.property(thatLocator, "content", rhsContent), lhsContent, rhsContent)) {
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
            List<JAXBElement<String>> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "content", theContent), currentHashCode, theContent);
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
            List<JAXBElement<String>> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        return buffer;
    }

}
