//https://github.com/fernandocc17, July 2016.
import java.util.Scanner;
//This code uses the basic flow structures to make a calculator 
public class Calculator {
	//defining constant for the option...disregard the static modifier, will be explained in the future
	static final int ADD=1;
	static final int SUBSTRACTION=2;
	static final int MULTIPLICATION=3;
	static final int DIVISION=4;
	
	int n1,n2;
	boolean band=false;
	
	//Method declaration
	void add(){
		int res;
		Scanner sc=new Scanner (System.in);
		System.out.println("Give me the 2 numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		res=n1+n2;
		System.out.println("The result is "+ res);
		
	}
	//On all the method we will ask for 2 numbers, so creating a method to ask the number and 
	void askData(){
		System.out.println("Give me the 2 numbers");
		Scanner sc=new Scanner (System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();	
	}
	void substraction(){
		askData();
		//You can do operation in the output if you enclose them with ()
		System.out.println("The result is: "+(n1-n2));
	}
	int division(){
		askData();
		//If divider equals 0 the division cannot be done
		if (n2==0)
		{
			//We activate the flag and put 0 as a result
			band=true;
			return 0;		
		}
		//If divider is another number we proceed to do the division
		else
		{
			return n1/n2;
		}
	}
	
	public static void main (String a[] ){
		Scanner sc=new Scanner (System.in);
		int opc = 0;
		int res=0;
		//Creating an object of our Calculator class, remember the object is on the right side, the left side is the reference variable
		//If we dont create an object we won't be able to use the methods...or we could make everything static( not a good practice)
		Calculator c=new Calculator();
		//Showing menu to the user
		do{
			//This can be printed on the same line but is easier to read the code like this
			System.out.println("1-Add         \n" +
							  "2-Substraction		    \n" +
							  "3-Multiply	\n" +
							  "4-Division		\n"+
							  "5-Quit");
			opc=sc.nextInt();
			switch (opc){
			//Using constants defined before to avoid using literal numbers.
			//Since Java 7, a string can be used on a switch
				case ADD :c.add();
					break;
				case SUBSTRACTION:c.substraction();
					break;
				case MULTIPLICATION:c.askData();
					//C like for
					for (int i=0;i<c.n1;i++)
						res+=c.n2;
					System.out.println("The result is "+res);
					break;
				case DIVISION:res=c.division();
					//According to the JCC we should use {} even if it just for one line
					if (!c.band){
						System.out.println(res);
					}
						
					else{
						System.out.println("Cannot divide by zero");
					}
					break;			
				case 5:System.out.println("Bye!"); 		
					break;
				//No need for break on the last option.
				default:System.out.println("Wrong option"); 
		}	
		}while(opc!=5);
	}
}