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
 * 回覆的調閱項目資料
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
 *         &lt;element name="Result" type="{http://www.example.org/response}ResultType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "result"
})
public class RecordType
    extends org.example.common.RecordType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Result")
    protected List<ResultType> result;

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultType }
     * 
     * 
     */
    public List<ResultType> getResult() {
        if (result == null) {
            result = new ArrayList<ResultType>();
        }
        return this.result;
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
            List<ResultType> lhsResult;
            lhsResult = (((this.result!= null)&&(!this.result.isEmpty()))?this.getResult():null);
            List<ResultType> rhsResult;
            rhsResult = (((that.result!= null)&&(!that.result.isEmpty()))?that.getResult():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "result", lhsResult), LocatorUtils.property(thatLocator, "result", rhsResult), lhsResult, rhsResult)) {
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
            List<ResultType> theResult;
            theResult = (((this.result!= null)&&(!this.result.isEmpty()))?this.getResult():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "result", theResult), currentHashCode, theResult);
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
            List<ResultType> theResult;
            theResult = (((this.result!= null)&&(!this.result.isEmpty()))?this.getResult():null);
            strategy.appendField(locator, this, "result", buffer, theResult);
        }
        return buffer;
    }

}
