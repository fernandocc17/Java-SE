import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Principal {
 
	static final int ESCRIBIR=1;
	static final int LEER=2;
	static final int SALIR=3;

public void leer(){
	FileReader fr = null;
	try {
		fr = new FileReader("archivo.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	BufferedReader br=new BufferedReader(fr);

	String aux=null;
	try {
		while(br.ready())
			
			System.out.println(br.readLine());
	} catch (IOException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	try {
		br.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		fr.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
 }
 public void escribir(String cadena){
	FileWriter fw = null;
	try {//Creamos el objeto-archivo donde vamos a escribir
		fw = new FileWriter("archivo.txt",true);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//Creamos el escritor del archivo
	PrintWriter pw=new PrintWriter (fw);
	//Escribimos en el archivo
	pw.println(cadena);
	
	pw.close();
	try {
		fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 public static void main (String [] args){
	 
	 Scanner sc=new Scanner (System.in);
	 int opc=0;
	 Principal p=new Principal();
	 do{
		 System.out.println("1.- Escribir");
		 System.out.println("2.- Leer");
		 System.out.println("3.- Salir");
		 opc=sc.nextInt();
		 switch(opc){
		 case ESCRIBIR: System.out.println("Dame lo que vas a escribir");
		 		p.escribir(sc.next());
		 		break;
		 case LEER:p.leer();
		 		break;
		 case SALIR:System.out.println("Adios!");
		 		break;
		 default: System.out.println("Opcion equivocada");
		 	break;
		 }
		 
	 }while (opc!=3);
 }
}
