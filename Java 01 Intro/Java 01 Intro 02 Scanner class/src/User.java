//https://github.com/fernandocc17, July 2016.

//Importing the Scanner class from package java.util
//A full import of the package can be done with java.util.*, this is not encouraged.
import java.util.Scanner;
public class User {
	public static void main(String[] args) {
		//According to the Java Code Convention, only one variable should be defined per line.
		//Java requires that each primitive is initialized. 
		int age=0;
		float salary=0;
		//These 2 next lines are not primitive variables, they are reference variables, they will point to an instance(object) of a class.
		//name and sc will be pointing both to null
		String name;
		//Scanner class allows to read from the keyboard among other things.
		Scanner sc=null;
		//new is the keyword for creating an object of a class, the right side of the = is the object, the left side is reference variable.
		sc=new Scanner(System.in);
		System.out.println("Whats your name?");
		//This will read the next string coming from the keyboard until ENTER is pressed.
		name=sc.nextLine();		
		System.out.println("How much do you wanna make?");
		//Scanner class has methods to read every primitive and string.
		salary=sc.nextFloat();
		System.out.println("What's your age?");
		age=sc.nextInt();
		//To concatenate simply end the "" and add +, do this as many times as necessary.
		System.out.println("Your name is "+name+ " your age is "+ age+ " and you want to make "+ salary);
	}
}
