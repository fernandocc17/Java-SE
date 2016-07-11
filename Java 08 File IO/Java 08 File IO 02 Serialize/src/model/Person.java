//https://github.com/fernandocc17, July 2016.
package model;
import java.io.Serializable;
public class Person implements Serializable{
private static final long serialVersionUID = 446853974294240111L;
String name;
int age;
//this field wont be serialized
transient double salary;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "The person is: "+ name+ " is "+ age+ " years old and makes "+ salary;
}
public Person(String name, int age, double salary) {
	super();
	this.name = name;
	this.age = age;
	this.salary = salary;
}
}