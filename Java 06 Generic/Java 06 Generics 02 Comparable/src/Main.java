//https://github.com/fernandocc17, July 2016.
public class Main {
	//<T extends Comparable <T>> means that this method is generic and this generic type is extending the comparable class so you can compare object from T class using compareTo
	//T getMax, the T makes the method able to return an T type object
	public static <T extends Comparable <T>> T getMax(T []  tempArray){
		T max = tempArray[0];
		for(T aux:tempArray){
			if(aux.compareTo(max)>1){
				System.out.println("Bigger "+ aux+ " than" + max);
				max=aux;
			}				
		}
		return max ;
	}
	public static void main(String[] args) {
		Integer [] integerArray={1,2,3,4,5,6,7,8,9,10};
		Double [] doubleArray={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		Character [] charArray={'a','s','d','f','g','h','j','k','l','a'};
		System.out.println("Max value" + getMax(charArray));
		System.out.println("Max value " + getMax(integerArray));
		System.out.println("Max value " + getMax(doubleArray));
	}
}