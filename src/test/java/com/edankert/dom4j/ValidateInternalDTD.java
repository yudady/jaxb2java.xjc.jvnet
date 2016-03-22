/*
 * Generated at : 09-May-2006 20:45:32
 *
 * Copyright (c) 2005 - 2006, Edwin Dankert 
 * All rights reserved. 
 */

package com.edankert.dom4j;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;

import com.edankert.SimpleErrorHandler;

public class ValidateInternalDTD {

    public static void main(String[] args) {
        try {
            SAXReader reader = new SAXReader();
            reader.setValidation(true);
            reader.setErrorHandler(new SimpleErrorHandler());
            reader.read("contacts.xml");
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }
}
