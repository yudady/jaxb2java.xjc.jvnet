package org.example.validation;

import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeFactory;

import org.example.response.ObjectFactory;
import org.example.response.RecordType;
import org.example.response.ResponseType;
import org.joda.time.DateTime;

public class MarshallerObj {

	public static void main(String[] args) throws Exception {

		ObjectFactory of = new ObjectFactory();
		ResponseType responseType = new ResponseType();
		responseType.setComment("AYW");
		responseType.setDocNo("警97字0501001號");
		responseType.setStatus(1);
		responseType.setResDT(DatatypeFactory.newInstance().newXMLGregorianCalendar(new DateTime(2011, 12, 31, 12, 00).toGregorianCalendar()));
		List<RecordType> records = responseType.getRecord();
		RecordType recordType = of.createRecordType();
		records.add(recordType);
		recordType.setObjectType(90);
		recordType.setObject("356521043797399");
		recordType.setStartDT(DatatypeFactory.newInstance().newXMLGregorianCalendar(new DateTime(2011, 12, 31, 12, 00).toGregorianCalendar()));
		recordType.setEndDT(DatatypeFactory.newInstance().newXMLGregorianCalendar(new DateTime(2011, 12, 31, 12, 00).toGregorianCalendar()));
		recordType.setVendorType("行網");
		recordType.setVendorName("台灣之星");

		JAXBElement<ResponseType> rootElement = of.createResponse(responseType);
		JAXBContext jaxbContext = JAXBContext.newInstance("org.example.response");
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NamespacePrefixMapperImpl());
		jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.example.org/response ../xsd/responseCSP.xsd http://www.example.org/common ../xsd/common.xsd");

		jaxbMarshaller.marshal(rootElement, System.out);

	}
}
