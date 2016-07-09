//https://github.com/fernandocc17, July 2016.
import Printers.GenericPrinter;
import Printers.NormalPrinter;	
public class Main {
	public static void main(String[] args) {
		Integer [] integerArray={1,2,3,4,5,6,7,8,9,10};
		Double [] doubleArray={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		Character [] charArray={'a','s','d','f','g','h','j','k','l','a'};
		NormalPrinter n=new NormalPrinter();
		System.out.println("Printing Integer Array");
		n.printIntArray(integerArray);
		System.out.println("Printing Double Array");
		n.printDoubleArray(doubleArray);
		System.out.println("Printing Char Array");
		n.printCharArray(charArray);
		
		GenericPrinter g=new GenericPrinter();
		System.out.println("Printing generic Integer array");
		g.printWhateverType(integerArray);
		System.out.println("Printing generic Double array");
		g.printWhateverType(doubleArray);
		System.out.println("Printing generic Char array");
		g.printWhateverType(charArray);		
	}
}