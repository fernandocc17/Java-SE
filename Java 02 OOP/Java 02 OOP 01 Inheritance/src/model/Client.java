//https://github.com/fernandocc17, July 2016.
package model;

//The extends makes Client a subclass of Person, what makes it inherit all the non private attributes and methods,
public class Client extends Person {
public int id;

public Client (String name,String lastName1,String lastName2,String bDay,int id){
	//"super" makes a call to the constructor of the super-class
	//The call to a constructor for a super-class or the same class has to be the first thing on the constructor, it cannot be done after that
	super(name, lastName1, lastName2, bDay);
	//id is a variable for Client not Person, so this is done on Client own constructor.
	this.id=id;
}
}
