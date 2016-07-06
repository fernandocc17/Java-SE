import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dame el balance de la cuenta");
		double b=sc.nextDouble();
		
		Cuenta c=new Cuenta(b);

	}

}
