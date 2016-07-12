
import java.io.FileInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class Main {
  @SuppressWarnings("unused")
public static void main(String args[]) {  
     //Alternate between these 2 on line 38 to see the difference
	 String goodFile="data.xml";
     String badFile="badData.xml";
	  try{
		  DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		  factory.setValidating(true);
		  DocumentBuilder builder = factory.newDocumentBuilder();
		  builder.setErrorHandler(new org.xml.sax.ErrorHandler() {
				  public void fatalError(SAXParseException exception) throws SAXException { }
				  
				  public void error(SAXParseException e) throws SAXParseException {
					  System.out.println("Error on line " +e.getLineNumber() );
					  System.out.println(e.getMessage());
					  System.exit(0);
				  }				 
				  public void warning(SAXParseException err) throws SAXParseException{
					  System.out.println(err.getMessage());
					  System.exit(0);
				  }
		  });
		  Document xmlDocument    = builder.parse(new FileInputStream(badFile));
		  DOMSource source        = new DOMSource(xmlDocument);
		  StreamResult result     = new StreamResult(System.out);
		  TransformerFactory tf   = TransformerFactory.newInstance();
		  Transformer transformer = tf.newTransformer();
		  transformer.setOutputProperty(OutputKeys.DOCTYPE_SYSTEM, "data.dtd");
		  transformer.transform(source, result);
     }
     catch (Exception e) {
		  e.printStackTrace();
     }
  }
}