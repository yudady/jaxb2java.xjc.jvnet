package org.example.validation;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Test;
import org.xml.sax.SAXException;

public class XSDValidatorTest {

	@Test
	public void testValidate() throws Exception {
		String xsdPath = "F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/java/Books.xsd";
		String xmlPath = "F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/java/Books.xml";
		InputStream xsdStream = null;
		InputStream xmlStream = null;

		try {
			xsdStream = new FileInputStream(xsdPath);
			xmlStream = new FileInputStream(xmlPath);
			XSDValidator.validate(xsdStream, xmlStream);
			System.out.println("Validate successfully.");
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (xsdStream != null) {
				xsdStream.close();
			}
			if (xmlStream != null) {
				xmlStream.close();
			}
		}
	}

}
