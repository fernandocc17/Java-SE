import java.util.Scanner;


public class Principal {

	public static void main(String [] a ){
		System.out.println("Dame el balance de la cuenta a crear");
		Scanner sc=new Scanner(System.in);
		double bal;
		bal=sc.nextDouble();
		Cuenta c=new Cuenta(bal);
	}
}
