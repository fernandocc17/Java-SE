//https://github.com/fernandocc17, July 2016.
import java.util.Scanner;
public class Main {

	public static void main(String [] a ){
		System.out.println("Give the new balance for the account");
		Scanner sc=new Scanner(System.in);
		double bal;
		bal=sc.nextDouble();
		Account c=new Account();
		//c.setBalance(bal);
		try {
			//since we are calling a method with "throws" we must either surround with try-catch or propagate.
			//if you want to see it for yourself remove the comment on line 11.
			c.setBalance(bal);
		} catch (NoMoneyException e) {
			e.printStackTrace();
		}
	}
}
