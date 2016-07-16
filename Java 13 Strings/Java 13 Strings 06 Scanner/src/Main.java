import java.util.Scanner;

//https://github.com/fernandocc17, July 2016.
public class Main {
	public static void main(String[] args) {
		String string="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur viverra nisl vehicula ligula vestibulum tempus.";
		Scanner sc=new Scanner(string);
		//setting the delimiter as a string but it can also be used as a regex pattern
		sc.useDelimiter(" ");
		while(sc.hasNext()){
			System.out.println(sc.next());
		}
	}

}
