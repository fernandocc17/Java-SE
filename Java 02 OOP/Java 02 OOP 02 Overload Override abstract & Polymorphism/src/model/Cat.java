package model;
//https://github.com/fernandocc17, July 2016.
public class Cat extends Pet{
	public Cat(String name, String kindOfPet, String breed) {
		super(name, kindOfPet, breed);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void sleep() {
		super.sleep();
		System.out.println("at day because I'm a cat.");
	}
	@Override
	public void makeASound() {
		System.out.println("MIAU");
	}
	//overload
	public void makeASound(String stimulus) {
		if (stimulus.equalsIgnoreCase("treat")){
			System.out.println("PURR");
		}else{
			makeASound();
		}
	}
}