package org.example.validation;

import java.io.File;
import java.io.IOException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidation {

	public static void main(String[] args) {

		System.out.println(" validates " + validateXMLSchema("F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xsd/responseCSP.xsd",
				"F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xml/responseCSP.xml"));
		System.out.println(" validates " + validateXMLSchema("F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xsd/responseCSP.xsd",
				"F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xml/responseCSP2.xml"));
		System.out.println(" validates " + validateXMLSchema("F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xsd/responseCSP.xsd",
				"F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xml/responseCSP3.xml"));

	}

	public static boolean validateXMLSchema(String xsdPath, String xmlPath) {

		try {
			SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlPath)));
		} catch (IOException | SAXException e) {
			System.out.println("Exception: " + e.getMessage());
			System.out.println("false");
			return false;
		}
		System.out.println("true");
		return true;
	}
}
