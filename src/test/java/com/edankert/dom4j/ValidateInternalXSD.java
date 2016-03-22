/*
 * Generated at : 09-May-2006 20:45:32
 *
 * Copyright (c) 2005 - 2006, Edwin Dankert 
 * All rights reserved. 
 */

package com.edankert.dom4j;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.xml.sax.SAXException;

import com.edankert.SimpleErrorHandler;

public class ValidateInternalXSD {

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setValidating(true);

            SAXParser parser = factory.newSAXParser();
            parser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
            
            SAXReader reader = new SAXReader(parser.getXMLReader());
            reader.setErrorHandler(new SimpleErrorHandler());
            reader.setValidation(true);
            reader.read("contacts.xml");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
