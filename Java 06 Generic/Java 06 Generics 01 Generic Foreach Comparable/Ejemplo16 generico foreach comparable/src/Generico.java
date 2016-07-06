
public class Generico {

	public <T> void imprimirDeLoQueSea (T [] arreglo){
		/*int max =arreglo.length;
		for (int i=0;i<max;i++){
			System.out.println(arreglo[i]);
		}*/
		for(T aux:arreglo)
			System.out.println(aux);
}

	//<T> Significa que es un metodo es generico 
	//T []  arreglo, que se recibe un parametro de tipo, T
	//extends comparable,implementa la interface generica
	//y nos permite usar el compareTo para comparar objetos
	// Comparable <T> la interface es generica x lo que hay que especificar el tipo de dato
	public <T extends Comparable <T>> T getMaximo(T []  arreglo){
		T max = arreglo[0];
		for(T aux:arreglo){
			System.out.println("A evaluar "+ aux + max);
			//0 si son iguales
			//<0 si el primero es menor
			//>0 si el primero es mayor
			if(aux.compareTo(max)>1){
				System.out.println("Se evaluo a "+ aux+ "y" + max +" es mayor");
				max=aux;
			}
				
		}
			
		return max ;
	}
}
