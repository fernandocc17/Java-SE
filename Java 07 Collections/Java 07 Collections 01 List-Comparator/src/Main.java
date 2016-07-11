//https://github.com/fernandocc17, July 2016.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import controller.PersonOrdererByAge;
import model.Person;
public class Main {
	public static void main(String[] args) {
		Person p1=new Person("FerC",24);
		Person p2=new Person("Chuck Norris",42);
		Person p3=new Person("Barry Allen",22);
		//All the collections are generic, unless it is specified they will all receive Object type.
		List<Person> al =new ArrayList<Person>();
		//List is an interface and ArrayList is the concrete class, so you can check other easy other collections like Vector and LinkedList just changing ArrayList.
		//All collections are dynamic in size, AL starts with a size of 10 and it will twice its size everytime is needed.
		//Add the persons to the ArrayList
		al.add(p1);
		al.add(p2);
		al.add(p3);
		//Please note that size is a method and not a field, so it performs actions every time is called, avoid using it on a cycle.
		int size=al.size();
		System.out.println("Normal printing:");
		for (int i=0; i<size;i++){
			//The get method gives access to the object on the specified index
			System.out.println(al.get(i).toString());
		}
		System.out.println("\nIterator printing:");
		//Most of the collections have an iterator that allows to move across the entire collection
		Iterator<Person> iP=al.iterator();
		//We mark the iterator<Person> so it will know it is for a person object, otherwise everytime we use it we will have to cast
		while (iP.hasNext()){
			System.out.println(iP.next().toString());	
		}	
		System.out.println("\nSorted array by age");
		//Collections will sort the array using the Custom Comparator we built.
		Collections.sort(al,new PersonOrdererByAge());
		iP=al.iterator();
		while (iP.hasNext())
			System.out.println(iP.next().toString());		
		}
	}