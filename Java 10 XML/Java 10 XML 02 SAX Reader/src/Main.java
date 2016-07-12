//https://github.com/fernandocc17, July 2016.
import java.io.FileInputStream;
import java.io.IOException;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;
import controller.XMLProcessor;
public class Main {
   public static void main(String[] args) {      
      try {
         //Creating a XML reader object
         XMLReader reader = XMLReaderFactory.createXMLReader();
         //Adding our own processor to the XMLReader 
         reader.setContentHandler(new XMLProcessor());         
         // Procesamos el xml de ejemplo
         //parsing the XML file books using the xml reader with our own Handler
         reader.parse(new InputSource(new FileInputStream("books.xml")));
      } catch (SAXException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }

   }

}
