package ejemplo;
import java.io.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

public class DomXmlExample {

    public static void main (String args[]) {
        new DomXmlExample();
    }

    public DomXmlExample() {
        try {
            DocumentBuilderFactory dbfac = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbfac.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element root = doc.createElement("cd");
            doc.appendChild(root);
            Comment comment = doc.createComment("Es un comentario");
            root.appendChild(comment);
			for (int i=0; i < 30; i++) {
				Element child = doc.createElement("ref");
				child.setAttribute("nombre" + String.valueOf(i), "valor" + String.valueOf(i));
				root.appendChild(child);
				Text text = doc.createTextNode("Contenido: " + String.valueOf(i));
				child.appendChild(text);
			}
            TransformerFactory transfac = TransformerFactory.newInstance();
            Transformer trans = transfac.newTransformer();
            trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            trans.setOutputProperty(OutputKeys.INDENT, "yes");
            StringWriter sw = new StringWriter();
            StreamResult result = new StreamResult(sw);
            DOMSource source = new DOMSource(doc);
            trans.transform(source, result);
            String xmlString = sw.toString();
            System.out.println("texto en xml:\n\n" + xmlString);
			try{
			  // Create file 
			  FileWriter fstream = new FileWriter("salida.xml");
			  BufferedWriter out = new BufferedWriter(fstream);
			  out.write(xmlString);
			  out.close();
			} catch (Exception e){
			     System.err.println("Error: " + e.getMessage());
			}
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}