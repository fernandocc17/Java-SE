package model;
//https://github.com/fernandocc17, July 2016.
public class Dog extends Pet{
	@Override
	public void makeASound() {
		System.out.println("BARK!");
	}
	public Dog(String name, String kindOfPet, String breed) {
		super(name, kindOfPet, breed);
	}
	//This constructor calls the above one, it is missing the breed kind, so a generic breed is hardcoded
	public Dog(String name, String kindOfPet) {
		//As with the super call to the constructor, the "this" call has to be the first thing on the constructor if it wants to be used.
		this(name, kindOfPet, "Street dog");
	}
}
