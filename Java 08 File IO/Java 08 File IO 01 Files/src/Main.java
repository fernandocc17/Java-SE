//https://github.com/fernandocc17, July 2016.
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
static final int WRITE=1;
static final int READ=2;
static final int EXIT=3;
static final String FILE="file.txt";
public void read(){
	FileReader fr = null;
	try {
		//Opening the file reader
		fr = new FileReader(FILE);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	//Using a buffer to "cover" the filereader, this way is easier to read.
	BufferedReader br=new BufferedReader(fr);
	try {
		//this will let us know if the file is still readable, never put string aux=br.readLine() in the while, is a bad practice
		while(br.ready())
			System.out.println(br.readLine());
	} catch (IOException e2) {
		e2.printStackTrace();
	}
	try {
		br.close();
		fr.close();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
 }
 public void write(String string){
	FileWriter fw = null;
	try {
		//Creating the file with the append option, so we don't overwrite previous lines.
		fw = new FileWriter(FILE,true);
	} catch (IOException e) {
		e.printStackTrace();
	}
	//Creating the printer for the filer
	PrintWriter pw=new PrintWriter (fw);
	//Writing in the file
	pw.println(string);
	pw.close();
	try {
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
 }
 public static void main (String [] args){
	 Scanner sc=new Scanner (System.in);
	 int opc=0;
	 Main p=new Main();
	 do{
		 System.out.println("1.- Write");
		 System.out.println("2.- Read");
		 System.out.println("3.- Exit");
		 opc=sc.nextInt();
		 switch(opc){
		 case WRITE: System.out.println("Next String");
		 		p.write(sc.next());
		 		break;
		 case READ:p.read();
		 		break;
		 case EXIT:System.out.println("Bye!");
		 		break;
		 default: System.out.println("Wrong choice");
		 	break;
		 }
	 }while (opc!=3);
 }
}