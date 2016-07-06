import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona p=new Persona("jose",35,50.5);
		FileInputStream fi=null;
		FileOutputStream fo=null;
		ObjectInputStream oi=null;
		ObjectOutputStream oo=null;
		
		try {
			fo=new FileOutputStream("persona.txt");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
		 oo=new ObjectOutputStream (fo);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			oo.writeObject(p);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		p=null;
		try {
			 fi=new FileInputStream("persona.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oi=new ObjectInputStream(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			p=(Persona) oi.readObject();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(p.toString());
		
	}

}
