import model.Client;
//https://github.com/fernandocc17, July 2016.
public class Main {
	//This is the main class
	public static void main (String[] args){
		//Creating and using
		Client c=new Client("Fernando","Carrillo","Castro","123456",42);
		//calls the RFC generator method and prints the string on caps
		System.out.println(c.rfc.toUpperCase()+c.id);
	}

		
}
