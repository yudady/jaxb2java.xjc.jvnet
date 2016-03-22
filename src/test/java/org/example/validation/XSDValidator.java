package org.example.validation;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XSDValidator {

	static public void validate(InputStream xsdStream, InputStream xmlStream) throws SAXException, IOException {
		SchemaFactory schemaFactory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
		Source xsdSource = new StreamSource(xsdStream);
		Schema schema = schemaFactory.newSchema(xsdSource);

		Source xmlSource = new StreamSource(xmlStream);

		Validator validator = schema.newValidator();
		validator.validate(xmlSource);
	}

}
