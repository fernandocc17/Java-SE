import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		File fd=new File("Lorem Ipsum.txt");
		Scanner sc=null;
		try {
			//The scanner constructor can also take a flow(like buffered reader or system.in)
			sc=new Scanner(fd);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(sc.hasNext()){
			System.out.println(sc.nextLine());
		}
	}
}
