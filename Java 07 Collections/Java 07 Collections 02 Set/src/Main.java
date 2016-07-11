//https://github.com/fernandocc17, July 2016.
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Main {
	public static void main(String[] args) {
		//The interface Set has different implementation like TreeSet(sorted version), HashSet, LinkedHashSet,etc.
		//The set collection doesn't allow duplicates
		Set<String> hs =new HashSet<String>();
		hs.add("FerC");
		hs.add("Chuck Norris");
		hs.add("Barry Allen");
		hs.add("FerC");
		Iterator<String> it=hs.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}