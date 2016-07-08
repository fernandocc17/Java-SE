//https://github.com/fernandocc17, July 2016.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Account balance:");
		double b=sc.nextDouble();
		Account c=new Account();
		c.setBalance(b);
	}

}
