//https://github.com/fernandocc17, July 2016.
package Printers;
public class GenericPrinter {

	//<T> means that it is a generic method, so it can receives whatever types of objects, NOT primitives
	public  <T> void printWhateverType (T [] tempArray){
		for(T aux:tempArray)
			System.out.println(aux);
}

	//<T extends Comparable <T>> means that this method is generic and this generic type is extending the comparable class so you can compare object from T class using compareTo
	//T getMax, the T makes the method able to return an T type object
	public <T extends Comparable <T>> T getMax(T []  tempArray){
		T max = tempArray[0];
		for(T aux:tempArray){
			if(aux.compareTo(max)>1){
				System.out.println("Bigger "+ aux+ " than" + max);
				max=aux;
			}				
		}
		return max ;
	}
}