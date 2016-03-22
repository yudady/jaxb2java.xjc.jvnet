//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.03.22 於 01:32:24 PM CST 
//


package org.example.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DataExpectedType 的 Java 類別.
 * 
 * <p>下列綱要片段會指定此類別中包含的預期內容.
 * <p>
 * <pre>
 * &lt;simpleType name="DataExpectedType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CUSTOMER_INFO"/&gt;
 *     &lt;enumeration value="COMMUNICATION_INFO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DataExpectedType")
@XmlEnum
public enum DataExpectedType {

    CUSTOMER_INFO,
    COMMUNICATION_INFO;

    public String value() {
        return name();
    }

    public static DataExpectedType fromValue(String v) {
        return valueOf(v);
    }

}
