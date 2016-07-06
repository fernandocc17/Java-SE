import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Scanner;


public class Principal {

public static void main (String[] args) throws IOException{
	Properties propiedades=new Properties();

	String a1=null,a2=null;
	Scanner sc=new Scanner(System.in);
	System.out.println("Dame un valor");
	a1=sc.next();

	System.out.println("Dame otro valor");
	a2=sc.next();
	
	
	propiedades.setProperty(String.valueOf(a1.hashCode()), a1);
	propiedades.setProperty("2do valor", a2);

	
	FileOutputStream op=new FileOutputStream("propiedades.txt");
	
	propiedades.store(op, "Comentarios x de la vida");
	
	propiedades=null;
	
	InputStream fi=new FileInputStream("propiedades.txt");
	
	propiedades=new Properties();
	
	propiedades.load(fi);
	
	Iterator i=propiedades.entrySet().iterator();
	
	while(i.hasNext()){
		System.out.println(i.next().toString());
	}
}

}
