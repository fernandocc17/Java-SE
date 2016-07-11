//https://github.com/fernandocc17, July 2016.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Main {
	public static void main(String[] args) {
		//The map interface is not exactly a Collection since it doesn't come from the Collection interface.
		//This interface works with a key-value pair, both of them have to be Objects, not primitives
		//Besides Hashmap there are a lot of other concrete classes like: WeakHashMap, LinkedHashMap, TreMeMap(Sorted),etc.
		//There cannot be any duplicate keys.
		Map<Integer, String> hm=new HashMap<Integer, String>();
		String val1="FerC";
		String val2="Chuck Norris";
		String val3="Bruce Wayne";
		hm.put(val1.hashCode(), val1);
		hm.put(val2.hashCode(), val2);
		hm.put(val3.hashCode(), val3);
		//Since Map doesn't have a iterator by itself one of the ways to go through every entry is getting the key set for the keys and then use it to get the values.  
		Iterator<Integer> it=hm.keySet().iterator();
		Integer key;
		while(it.hasNext()){
			key=it.next();
			System.out.println("Key="+key+", Value="+hm.get(key));
		}
	}
}