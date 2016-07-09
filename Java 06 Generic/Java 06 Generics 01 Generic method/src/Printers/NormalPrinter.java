//https://github.com/fernandocc17, July 2016.
package Printers;
public class NormalPrinter {
	//this is the standard way you will print an array for 3 types of primitives
	public void printIntArray(Integer [] array){
		for (int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	public void printDoubleArray(Double [] array){
		for (int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
	public void printCharArray(Character [] array){
		for (int i=0;i<array.length;i++)
			System.out.println(array[i]);
	}
}
