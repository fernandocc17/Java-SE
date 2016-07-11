//https://github.com/fernandocc17, July 2016.
package controller;
import java.util.Comparator;
import model.Person;
public class PersonOrdererByAge implements Comparator <Person>{
	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}
}