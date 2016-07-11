//https://github.com/fernandocc17, July 2016.
public class Main {
public static void main(String[] args) {
	System.out.println("Custom Stack");	
	//The generic class must be declared with an object type, after this cs can only receive Integer types otherwise it will  cause a compilation error.
	CustomStack<Integer> cs=new CustomStack<Integer>(3);
	cs.push(0);
	cs.push(4);
	cs.push(2);
	//no more room
	cs.push(4);
	cs.push(2);		
	//Remove comment line 14 to see the error.
	//cs.push("Hello world");
	}	
}
