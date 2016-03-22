package org.example.validation;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class NamespacePrefixMapperImpl extends NamespacePrefixMapper {

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {

		if (namespaceUri == null || namespaceUri.equals("")) {
			return "";
		}
		if (namespaceUri.equalsIgnoreCase("http://www.example.org/common")) {
			return "common";
		}
		if (namespaceUri.equalsIgnoreCase("http://www.example.org/response")) {
			return "response";
		}
		return suggestion;
	}

}