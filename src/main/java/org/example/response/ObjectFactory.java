//
// 此檔案是由 JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 所產生 
// 請參閱 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 一旦重新編譯來源綱要, 對此檔案所做的任何修改都將會遺失. 
// 產生時間: 2016.03.22 於 01:32:24 PM CST 
//


package org.example.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.response package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Response_QNAME = new QName("http://www.example.org/response", "Response");
    private final static QName _VenderSpecificTypeInstallAddress_QNAME = new QName("http://www.example.org/response", "InstallAddress");
    private final static QName _VenderSpecificTypeDedicatedLine_QNAME = new QName("http://www.example.org/response", "DedicatedLine");
    private final static QName _VenderSpecificTypeAttachNumber_QNAME = new QName("http://www.example.org/response", "AttachNumber");
    private final static QName _VenderSpecificTypeServiceType_QNAME = new QName("http://www.example.org/response", "ServiceType");
    private final static QName _VenderSpecificTypeLANIP_QNAME = new QName("http://www.example.org/response", "LANIP");
    private final static QName _VenderSpecificTypeWANIP_QNAME = new QName("http://www.example.org/response", "WANIP");
    private final static QName _VenderSpecificTypeContact_QNAME = new QName("http://www.example.org/response", "Contact");
    private final static QName _VenderSpecificTypePhone_QNAME = new QName("http://www.example.org/response", "Phone");
    private final static QName _VenderSpecificTypeMSISDN_QNAME = new QName("http://www.example.org/response", "MSISDN");
    private final static QName _VenderSpecificTypeCategory_QNAME = new QName("http://www.example.org/response", "Category");
    private final static QName _VenderSpecificTypeUsage_QNAME = new QName("http://www.example.org/response", "Usage");
    private final static QName _CustomerInfoTypeEmail_QNAME = new QName("http://www.example.org/response", "Email");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link CustomerInfoType }
     * 
     */
    public CustomerInfoType createCustomerInfoType() {
        return new CustomerInfoType();
    }

    /**
     * Create an instance of {@link CellInfoType }
     * 
     */
    public CellInfoType createCellInfoType() {
        return new CellInfoType();
    }

    /**
     * Create an instance of {@link RecordType }
     * 
     */
    public RecordType createRecordType() {
        return new RecordType();
    }

    /**
     * Create an instance of {@link VenderSpecificType }
     * 
     */
    public VenderSpecificType createVenderSpecificType() {
        return new VenderSpecificType();
    }

    /**
     * Create an instance of {@link ResultType }
     * 
     */
    public ResultType createResultType() {
        return new ResultType();
    }

    /**
     * Create an instance of {@link DataUsageType }
     * 
     */
    public DataUsageType createDataUsageType() {
        return new DataUsageType();
    }

    /**
     * Create an instance of {@link WiFiAccessInfoType }
     * 
     */
    public WiFiAccessInfoType createWiFiAccessInfoType() {
        return new WiFiAccessInfoType();
    }

    /**
     * Create an instance of {@link WiFiApInfoType }
     * 
     */
    public WiFiApInfoType createWiFiApInfoType() {
        return new WiFiApInfoType();
    }

    /**
     * Create an instance of {@link WiFiInfoType }
     * 
     */
    public WiFiInfoType createWiFiInfoType() {
        return new WiFiInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "Response")
    public JAXBElement<ResponseType> createResponse(ResponseType value) {
        return new JAXBElement<ResponseType>(_Response_QNAME, ResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "InstallAddress", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeInstallAddress(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeInstallAddress_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "DedicatedLine", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeDedicatedLine(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeDedicatedLine_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "AttachNumber", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeAttachNumber(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeAttachNumber_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "ServiceType", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeServiceType(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeServiceType_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "LANIP", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeLANIP(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeLANIP_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "WANIP", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeWANIP(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeWANIP_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "Contact", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeContact(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeContact_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "Phone", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypePhone(String value) {
        return new JAXBElement<String>(_VenderSpecificTypePhone_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "MSISDN", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeMSISDN(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeMSISDN_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "Category", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeCategory(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeCategory_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "Usage", scope = VenderSpecificType.class)
    public JAXBElement<String> createVenderSpecificTypeUsage(String value) {
        return new JAXBElement<String>(_VenderSpecificTypeUsage_QNAME, String.class, VenderSpecificType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/response", name = "Email", scope = CustomerInfoType.class)
    public JAXBElement<String> createCustomerInfoTypeEmail(String value) {
        return new JAXBElement<String>(_CustomerInfoTypeEmail_QNAME, String.class, CustomerInfoType.class, value);
    }

}
