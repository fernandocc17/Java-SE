//https://github.com/fernandocc17, July 2016.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.StringWriter;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Comment;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
public class Main {
    public static void main (String args[]) {
    	try {
            //Objects needed to create a XML with DOM
    		DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
            //this is the object used to create the XML tree
            Document doc = docBuilder.newDocument();
            //creating the root element
            Element root = doc.createElement("root");
            doc.appendChild(root);
            //how to add a comment
            Comment comment = doc.createComment("https://github.com/fernandocc17");
            root.appendChild(comment);
			for (int i=0; i < 30; i++) {
				//creating another element
				Element child = doc.createElement("ref");
				//adding attributes to the tag
				child.setAttribute("NAME" + String.valueOf(i), "VALUE" + String.valueOf(i));
				//adding the tag element to the root element
				root.appendChild(child);
				//adding the tag value
				Text text = doc.createTextNode("Content: " + String.valueOf(i));
				child.appendChild(text);
			}
			//These objects allows to transform the doc builder objects to the XML
			//Note that we are not directly instantiating them
            TransformerFactory transfac = TransformerFactory.newInstance();
            Transformer trans = transfac.newTransformer();
            trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            trans.setOutputProperty(OutputKeys.INDENT, "yes");
            StringWriter sw = new StringWriter();
            //Where the XML will be temporary stored.
            StreamResult result = new StreamResult(sw);
            //this will hold the doc builder so it tan transformed to a human readable XML.
            DOMSource source = new DOMSource(doc);
            //transforming the docbuilder object to a human readable XML.
            trans.transform(source, result);
            //Getting the actual String XML
            String xmlString = sw.toString();
            //Printing the output to the user
            System.out.println("XML Text:\n" + xmlString);
            FileWriter fstream =null;
            BufferedWriter out =null;
			try{
			  // Writing the XML to the file.
			  fstream = new FileWriter("output.xml");
			  out = new BufferedWriter(fstream);
			  out.write(xmlString);
			} catch (Exception e){
			     e.printStackTrace();
			}finally{
				out.close();
			}
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}