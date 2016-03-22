/*
 * Generated at : 09-May-2006 20:45:32
 *
 * Copyright (c) 2005 - 2006, Edwin Dankert 
 * All rights reserved. 
 */

package com.edankert.xom;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import nu.xom.Builder;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.edankert.SimpleErrorHandler;

public class ValidateInternalXSD {

    public static void main(String[] args) {
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            factory.setNamespaceAware(true);
            factory.setValidating(true);
            
            SAXParser parser = factory.newSAXParser();
            parser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");

            XMLReader reader = parser.getXMLReader();
            reader.setErrorHandler(new SimpleErrorHandler());

            Builder builder = new Builder(reader);
            builder.build("contacts.xml");
        } catch (ValidityException e) {
            e.printStackTrace();
        } catch (ParsingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
