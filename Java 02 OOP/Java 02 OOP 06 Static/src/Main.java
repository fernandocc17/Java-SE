//https://github.com/fernandocc17, July 2016.
//static import makes unneccessary to put the fully qualified name of the class. 
import static java.lang.Math.PI;
public class Main {
	public static void main(String[] args) {
		for (CountingClass.i=0         ; CountingClass.i<PI ;            ){
			CountingClass.increase();
		}
	}
}