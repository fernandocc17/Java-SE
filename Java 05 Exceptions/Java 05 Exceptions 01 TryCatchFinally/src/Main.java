//https://github.com/fernandocc17, July 2016.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

 public static void main(String[] args) {
	 String text;
	 InputStreamReader isr=new InputStreamReader(System.in);
	 BufferedReader br=new BufferedReader(isr);
	 
	 System.out.println("Write something");
	 //Ideally the try-catch block should be as small as possible since from the line it fails it will go to catch block.
	 //In Java SE7 was introduced the Try with resources it goes like this:
	 //try ( BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) ) {...}
	 //The try will automatically close and release the memory for all object in the right way, kind of avoiding us the finally block.
	 try {
		 //This line can cause a IOException, a "catch exception" so it must be surrounded by a try-catch block.
		 //This also how we got text from the keyboard before the Scanner class.
		text=br.readLine();
		System.out.println("This is your text: \""+ text+"\"");
	//The order in the exception must be from specific to general else it will get caught by the most general exception 
	 }catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}catch (Exception e){
	//the finally block will execute no matter what, even if there is a return statement on the try or catch block.
	//The whole function is to free the resource used previously regardless if the code worked OK or not.
	}finally{
		//Closing a stream can throw exception so we must surround the close part...if we dont close the file can get corrupted. 
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			isr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//We will also dereference the variable to help out the GC.
		isr=null;
		br=null;
		text=null;
	}

	}

}
