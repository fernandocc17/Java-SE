//https://github.com/fernandocc17, July 2016.
package model;
//An abstract class cannot be instantiated.
public abstract class Pet {
String name;
String kindOfPet;
String breed;

public Pet(String name,String kindOfPet,String breed){
	this.name=name;
	this.kindOfPet=kindOfPet;
	this.breed=breed;
}
@Override
//The toString method is a method that comes from the Object class, is used to print the most important fields of an object.
public String toString() {
	return "Pet [name=" + name + ", kindOfPet=" + kindOfPet + ", breed="
			+ breed + "]";
}
public void sleep(){
	System.out.print("Sleeping...");
}
//All the pets have a unique sound, making this method abstract make that all the subclasses of this have to implement this method.
public abstract void makeASound();
}