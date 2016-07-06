import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;


public class Principal {

	
	public static void cola (){
		PriorityQueue<String> pq=new PriorityQueue<String>();
//Insertar un elemento es con offer
		pq.offer("primer elemento");
//Ver un elemento 
		System.out.println("Vistazo al primer elemento "+pq.peek());
//Sacar un elemento
		System.out.println("Saco el primer elemento que es "+ pq.poll());

		System.out.println("Saco otro elemento que es "+ pq.poll());	
		
		pq.offer("2do elemento");
		pq.offer("3er elemento");
		mostrarCollection(pq.iterator());
		
		
		
	}
	public static void mapaHash(){
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put("valor1".hashCode(), "valor1");
		hm.put("valor2".hashCode(), "valor2");
		//System.out.println("el mapa contiene la llave valor1 "+ hm.containsKey("valor1".hashCode()));
//		mostrarMapa(hm.keySet().iterator(),hm);
		mostrarCollection(hm.entrySet().iterator());
		
	}
	public static void conjunto(){
		HashSet<String> hs =new HashSet();
		hs.add("Shrek");
		hs.add("Fiona");
		mostrarCollection(hs.iterator());
	}
	public static void arbolMapa(){
		TreeMap<Integer,String> tm=new TreeMap<Integer,String>();
		tm.put("Shreh".hashCode(), "Shrek");
		tm.put("Fiona".hashCode(), "Fiona");
		tm.put("Burro".hashCode(), "Burro");
		tm.put("Pinocho".hashCode(),"Pinocho");
		mostrarCollection(tm.entrySet().iterator());
		mostrarCollection(tm.keySet().iterator());
	}
	public static void arbolSet(){
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Fiona");
		ts.add("Burro");
		ts.add("Shrek");
		ts.add("pinocho");
		//System.out.println(ts.first()+ ts.last());
		//System.out.println(ts.pollFirst()+ ts.pollLast());
		mostrarCollection(ts.iterator());
		mostrarCollection(ts.descendingIterator());
	}
	public static void mostrarCollection(@SuppressWarnings("rawtypes") Iterator it){
		while (it.hasNext())
			System.out.println(it.next().toString());
	}
	@SuppressWarnings("rawtypes")
	public static void mostrarMapa(Iterator it,Map mapa){
		while(it.hasNext()){
			//int llave=(Integer) it.next().toString();
			//System.out.print("La llave es :" +llave );
			//System.out.println(" y el valor es " + mapa.get(llave) );
			//System.out.println(mapa.toString());
			System.out.println(it.next().toString());
		}	
	}
	public static void main(String[] args) {
		
		//cola();
		//mapaHash();
		//conjunto();
		//arbolMapa();
		arbolSet();
			
		
	}

}
