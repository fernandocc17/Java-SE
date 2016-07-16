//https://github.com/fernandocc17, July 2016.
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
public class Main {
	public static void main(String[] args) {
		try{
			//Opening the file
			File xmlFile=new File("books.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(xmlFile);
			//fixing the attributes values 
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			//Getting the nodes to browse through
			NodeList nList = doc.getElementsByTagName("book");
			//Note that it is a method and not a field
			int nodeLength=nList.getLength();
			for (int temp = 0; temp < nodeLength; temp++) {
				//getting the current node
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					//Get the element and then get the first value inside...remember that a XML is a tree than can contain further more element inside.
					System.out.println("Title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
					System.out.println("Author : " + eElement.getElementsByTagName("author").item(0).getTextContent());
				}
			}
		}catch(Exception e){}
	}
}