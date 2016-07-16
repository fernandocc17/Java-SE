//https://github.com/fernandocc17, July 2016.
package controller;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
//all the methods here were overrode from DefaultHandler
//SAX is event-driven so all the methods are called automatically.
public class XMLProcessor extends DefaultHandler{
   //this method is automatically called whenever the XML parsing starts
	@Override
   public void startDocument() throws SAXException {
	   System.out.println("DOC START");
   }
   //this method is automatically called whenever the XML parsing ends
   @Override
   public void endDocument() throws SAXException {
      System.out.println("\nDOC END.");
   }
   //this method gets called every time a new label is found.
   @Override
   public void startElement(String uri, String localName, String name,Attributes attributes) throws SAXException {
      System.out.println("LABEL START...");
      System.out.println("\tNAMESPACE URI: "+uri);
      System.out.println("\tNAME: "+localName);
      System.out.println("\tNAME WITH PREFIX: "+name);
      //Iterating through attributes 
      System.out.println("\tPROCESSING  "+attributes.getLength()+" ATTRIBUTES...");
      //notice that getLenght is a method, not a field, so avoid using it inside the for.
      int attributesLength=attributes.getLength();
      for(int i=0;i<attributesLength;i++){
         System.out.println("\t\tNAME: "+attributes.getQName(i));
         System.out.println("\t\tVALUE: "+attributes.getValue(i));
      }
      //We can also get attributes by name
      String valueID = attributes.getValue("id");
      if(valueID!=null){
         System.out.println("\tID: "+valueID);
      }
   }
   //this method will give the text/value inside a label, e.g. it will give the title of the book or the author name
   @Override
   public void characters(char[] ch, int start, int length) throws SAXException {
      System.out.println("PROCESSING TEXT ON A LABEL... ");
      System.out.print("\tTEXT: "+String.valueOf(ch, start, length));
   }
   //this method gets called at tag end. 
   @Override
   public void endElement(String uri, String localName, String name) throws SAXException {
      System.out.println("\nLABEL END...");
      System.out.println("\tNAMESPACE URI: "+uri);
      System.out.println("\tNAME: "+localName);
      System.out.println("\tNAME WITH PREFIX: "+name);
   }
}