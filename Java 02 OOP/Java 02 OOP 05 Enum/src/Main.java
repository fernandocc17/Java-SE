//https://github.com/fernandocc17, July 2016.
import java.util.Scanner;
import enums.Days;
public class Main {
	public static void main(String[] args) {
		//option for the switch
		int day;
		Scanner sc = new Scanner(System.in);
		//enum var reference
		Days d = null;
		System.out.println("Day of the week:");
		day = sc.nextInt();
		
		switch (day) {
		case 0:
			//The Enum cannot be instantiated. 
			d = Days.SUNDAY;
			break;
		case 1:
			d = Days.MONDAY;
			break;
		case 2:
			d = Days.TUESDAY;
			break;
		case 3:
			d = Days.WEDNESDAY;
			break;
		case 4:
			d = Days.THURSDAY;
			break;
		case 5:
			d = Days.FRIDAY;
			break;
		case 6:
			d = Days.SATURDAY;
			break;
		default:
			System.out.println("Invalid day");
		}
		System.out.println("Day's name "+d.name()+" and the value is "+d.getValue());
	}
}
