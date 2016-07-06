
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer [] arregloEntero={1,2,3,4,5,6,7,8,9,10};
		Double [] arregloDouble={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0,10.0};
		Character [] arregloChar={'a','s','d','f','g','h','j','k','l','a'};
		Normal n=new Normal();
		System.out.println("Arreglo de enteros normal");
		n.imprimirArregloEnteros(arregloEntero);

		System.out.println("Arreglo de double normal");
		n.imprimirArregloDouble(arregloDouble);
		
		System.out.println("Arreglo de char normal");
		n.imprimirArregloChar(arregloChar);
		
		Generico g=new Generico();
		System.out.println("Arreglo de enteros generico");
		g.imprimirDeLoQueSea(arregloEntero);
		System.out.println("Arreglo de doubles generico");
		g.imprimirDeLoQueSea(arregloDouble);
		System.out.println("Arreglo de character generico");
		
		g.imprimirDeLoQueSea(arregloChar);
		
		System.out.println("Valor maximo " + g.getMaximo(arregloChar));
	}

}
