package org.example.validation;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.SAXValidator;
import org.dom4j.io.XMLWriter;
import org.dom4j.util.XMLErrorHandler;

public class XMLValidation2 {
	public static void main(String[] args) {

		String xmlFileName1 = "F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xml/responseCSP.xml";
		String xmlFileName2 = "F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xml/responseCSP2.xml";
		String xmlFileName3 = "F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xml/responseCSP3.xml";
		String responseXsdFileName = "F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xsd/responseCSP.xsd";
		String commonXsdFileName = "F:/foya/t_star_project/cib_project/jaxb2java.xjc/src/main/resources/xsd/common.xsd";
		validation(xmlFileName1, responseXsdFileName, commonXsdFileName);
		validation(xmlFileName2, responseXsdFileName, commonXsdFileName);
		validation(xmlFileName3, responseXsdFileName, commonXsdFileName);

	}
	public static void validation(String xmlFileName ,String responseXsdFileName ,String commonXsdFileName ) {
		try {
			//創建默認的XML錯誤處理器
			XMLErrorHandler errorHandler = new XMLErrorHandler();
			//獲取基於 SAX 的解析器的實例
			SAXParserFactory factory = SAXParserFactory.newInstance();
			//解析器在解析時驗證 XML 內容。
			factory.setValidating(true);
			//指定由此代碼生成的解析器將提供對 XML 名稱空間的支持。
			factory.setNamespaceAware(true);



			//使用當前配置的工廠參數創建 SAXParser 的一個新實例。
			SAXParser parser = factory.newSAXParser();
			//創建一個讀取工具
			SAXReader xmlReader = new SAXReader();
			//獲取要校驗xml文檔實例
			Document xmlDocument = (Document) xmlReader.read(new File(xmlFileName));
			//設置 XMLReader 的基礎實現中的特定屬性。核心功能和屬性列表可以在[url]http://sax.sourceforge.net/?selected=get-set[/url] 中找到。
			parser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
			parser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaSource", commonXsdFileName);
			parser.setProperty("http://java.sun.com/xml/jaxp/properties/schemaSource", responseXsdFileName);
			//創建一個SAXValidator校驗工具，並設置校驗工具的屬性
			SAXValidator validator = new SAXValidator(parser.getXMLReader());
			//設置校驗工具的錯誤處理器，當發生錯誤時，可以從處理器對象中得到錯誤信息。
			validator.setErrorHandler(errorHandler);
			//校驗
			validator.validate(xmlDocument);

			XMLWriter writer = new XMLWriter(OutputFormat.createPrettyPrint());
			//如果錯誤信息不為空，說明校驗失敗，打印錯誤信息
			if (errorHandler.getErrors().hasContent()) {
				System.out.println("XML文件通過XSD文件校驗失敗！");
				writer.write(errorHandler.getErrors());
			} else {
				System.out.println("Good! XML文件通過XSD文件校驗成功！");
			}
		} catch (Exception ex) {
			System.out.println("XML文件: " + xmlFileName + " 通過XSD文件:" + responseXsdFileName + "檢驗失敗。\n原因： " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
