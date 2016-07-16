//https://github.com/fernandocc17, July 2016.
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
 public static void main(String[] args) {
	 String text = null;
	 System.out.println("Write something");
	 //The try will automatically close and release the memory for all object in the right way, kind of avoiding us the finally block.
	 try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
			text=br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This is your text: \""+ text+"\"");
	}
}