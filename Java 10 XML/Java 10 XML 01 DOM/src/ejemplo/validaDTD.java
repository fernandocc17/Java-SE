package ejemplo;
import java.io.*;
import org.w3c.dom.*;
import org.xml.sax.*;
import javax.xml.parsers.*;
import javax.xml.validation.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.transform.stream.StreamResult;

public class validaDTD {
  public static void main(String args[]) {  
     try{
		  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		  factory.setValidating(true);
		  DocumentBuilder builder = factory.newDocumentBuilder();
		  builder.setErrorHandler(new org.xml.sax.ErrorHandler() {
				  public void fatalError(SAXParseException exception) throws SAXException { }
				  
				  public void error(SAXParseException e) throws SAXParseException {
					  System.out.println("Error en " +e.getLineNumber() + " linea.");
					  System.out.println(e.getMessage());
					  System.exit(0);
				  
				  }				 
				  public void warning(SAXParseException err) throws SAXParseException{
					  System.out.println(err.getMessage());
					  System.exit(0);
				  }
		  });
		  Document xmlDocument    = builder.parse(new FileInputStream("datamal.xml"));
		  DOMSource source        = new DOMSource(xmlDocument);
		  StreamResult result     = new StreamResult(System.out);
		  TransformerFactory tf   = TransformerFactory.newInstance();
		  Transformer transformer = tf.newTransformer();
		  transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "data.dtd");
		  transformer.transform(source, result);
     }
     catch (Exception e) {
		  System.out.println(e.getMessage());
     }
  }
}