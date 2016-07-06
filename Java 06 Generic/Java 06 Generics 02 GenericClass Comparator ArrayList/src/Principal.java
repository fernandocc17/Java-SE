import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lifo<Integer> l=new Lifo(5);
		
		l.push(5);
		//no es posible xq definimos que Lifo solo va a recibir integer
		//l.push("hola");
		
		Persona p1=new Persona("Fernando",24);
		Persona p3=new Persona("Luis",32);
		
		ArrayList<Persona> al =new ArrayList();
		//De esta manera evitamos crear la variable p1 y nos
		//"ahorramos" algo de espacio de memoria
		//al.add(new Persona("Fernando",24);
		al.add(p3);
		al.add(p1);
		
//		al.add("hola");
		
		for (int i=0; i<al.size();i++){
			System.out.println(al.get(i).nombre+ al.get(i).edad);
		}
		
		Iterator i=al.iterator();
		
		while (i.hasNext())
			System.out.println(i.next().toString());		
		
		ArrayList <String> al2=new ArrayList();

		al2.add("a");
		al2.add("b");
		al2.add("d");
		al2.add("c");
		i=al2.iterator();
		System.out.println("Imprimiendo sin ordenar");
		while (i.hasNext())
			System.out.println(i.next().toString());
		Collections.sort(al2);
		System.out.println("Imprimiendo con orden");
		i=al2.iterator();
		while (i.hasNext())
			System.out.println(i.next().toString());
		
		System.out.println("Arreglo de personas sin ordenar");
		i=al.iterator();
		while (i.hasNext())
			System.out.println(i.next().toString());		
		System.out.println("Arreglo de personas ordenado");
		Collections.sort(al,new OrdenaPersona());
		i=al.iterator();
		while (i.hasNext())
			System.out.println(i.next().toString());		
		
	}

}
