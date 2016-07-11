//https://github.com/fernandocc17, July 2016.
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import model.Person;
public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Serialization is storing the current state of an object to a file, this can be used to "resurrect" the object later on or to pass through the network
		//Creating a new person
		Person p=new Person("FerC",35,99999);
		System.out.println(p.toString());
		//Objects needed to write
		FileOutputStream fo=null;
		ObjectOutputStream oo=null;
		//Object needed to read
		FileInputStream fi=null;
		ObjectInputStream oi=null;
		//file where the person will be written
		final String personFile="person.txt";
		//This can throw an exception, instead of adding a try-catch block for every Stream related line, I just added a throws to the method
		fo=new FileOutputStream(personFile);
		oo=new ObjectOutputStream (fo);
		//Writing the person object to the file
		oo.writeObject(p);
		//De-referencing the person object
		p=null;
		fi=new FileInputStream(personFile);
		oi=new ObjectInputStream(fi);
		//Reading the object in the file, this will return an object type, so it must be casted to the right class.
		p=(Person) oi.readObject();
		//this can throw the ClassNotFoundException
		System.out.println(p.toString());
	}
}