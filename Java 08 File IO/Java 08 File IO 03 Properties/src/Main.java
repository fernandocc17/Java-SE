//https://github.com/fernandocc17, July 2016.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;
public class Main {
public static void main (String[] args) throws IOException{
	//The properties class is a subclass of the HashTable that can store the entire hashtable in a readable file that can also be easily load to memory
	Properties prop=new Properties();
	final String propFile="properties.txt";
	String a1=null,a2=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Key");
	a1=sc.next();
	System.out.println("Value");
	a2=sc.next();
	
	prop.setProperty(a1, a2);
	//Preparing the file 
	FileOutputStream op=new FileOutputStream(propFile);
	//Writing the hashtable to the file.
	prop.store(op, "Comments");
	//De-referencing the properties object.
	prop=null;
	System.out.println("Showing the properties keys");
	InputStream fi=new FileInputStream(propFile);
	prop=new Properties();
	//loading the file
	prop.load(fi);
	@SuppressWarnings("rawtypes")
	Iterator i=prop.entrySet().iterator();
	while(i.hasNext()){
		System.out.println(i.next().toString());
	}
}
}