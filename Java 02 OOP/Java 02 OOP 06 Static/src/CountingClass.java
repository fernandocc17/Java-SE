//https://github.com/fernandocc17, July 2016.
public class CountingClass {
	//A static variable is not an instance variable is a class variable, it means that all the instances of this class will share the same variable
	static int i=0;
	//if a method is declared static, it can be used without instantiating an object of the class
	static void increase (){
		System.out.println(i++);
	}
}
