package org.example.validation;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.example.response.CustomerInfoType;
import org.example.response.RecordType;
import org.example.response.ResponseType;
import org.example.response.ResultType;
import org.xml.sax.InputSource;

public class UnmarshallerObj {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws Exception {

		// Context is the name of package
		String contextString = "org.example.response";

		// Create an instance of JAXB Context
		JAXBContext context = JAXBContext.newInstance(contextString);

		InputSource inputSource = new InputSource(new FileInputStream(new File("F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xml/responseCSP.xml")));

		Unmarshaller unmarshaller = context.createUnmarshaller();
		JAXBElement rootElement = (JAXBElement) unmarshaller.unmarshal(inputSource);
		System.out.println(rootElement.getClass().getName());
		System.out.println(rootElement.getName());
		System.out.println(rootElement.getValue().getClass().getName());

		ResponseType responseType = (ResponseType) rootElement.getValue();

		System.out.println(responseType.getStatus());
		System.out.println(responseType.getResDT());
		System.out.println(responseType.getDocNo());
		System.out.println(responseType.getComment());

		List<RecordType> records = responseType.getRecord();
		for (RecordType record : records) {
			System.out.println("record start-------------------------------");
			System.out.println(record.getObjectType());
			System.out.println(record.getObject());
			System.out.println(record.getStartDT());
			System.out.println(record.getEndDT());
			System.out.println(record.getVendorType());
			System.out.println(record.getVendorName());
			List<ResultType> results = record.getResult();
			for (ResultType result : results) {
				System.out.println("		record result start-------------------------------");
				CustomerInfoType customerInfo = result.getCustomerInfo();
				//System.out.println(customerInfo.getUID());
				System.out.println(ToStringBuilder.reflectionToString(customerInfo));
				System.out.println("		record result end-------------------------------");
			}

			System.out.println("record end-------------------------------");
		}

		System.out.println("[LOG]===============================================");
		System.out.println("[LOG]===============================================");
		System.out.println("[LOG]===============================================");
		System.out.println("[LOG]===============================================");
		System.out.println("[LOG]===============================================");
		System.out.println("[LOG]===============================================");
		System.out.println("[LOG]===============================================");
		System.out.println("[LOG]===============================================");
		System.out.println("[LOG]===============================================");

		JAXBContext jaxbContext = JAXBContext.newInstance(contextString);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NamespacePrefixMapperImpl());
		jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "http://www.example.org/response ../xsd/responseCSP.xsd http://www.example.org/common ../xsd/common.xsd");

		jaxbMarshaller.marshal(rootElement, System.out);

	}
}
