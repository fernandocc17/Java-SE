//importing all the classes on the package
import model.*;

//https://github.com/fernandocc17, July 2016.
public class Main {
	public static void main (String[] args ){
		System.out.println("DOG");
		Dog d1=new Dog("Spike","Dog");
		d1.makeASound();
		//Even when dog doesn't explicitly have sleep it can do it because it is a pet. 
		d1.sleep();
		System.out.println("\n\nCAT");
		Cat c1=new Cat("Grumpy","Cat","Persian");
		//PURR
		c1.makeASound();
		//The cat will PURR instead of MIAU because of the treat.
		//This is an overloaded method
		c1.makeASound("treat");
		//override method
		//The cat will sleep but at the day
		c1.sleep();
		System.out.println("\n\nCAT POLYMORPHISM");
		Pet genericPet=new Cat("The new Grumpy","Cat","Persian");
		System.out.println(genericPet.toString());
		genericPet.makeASound();
		genericPet.sleep();
		//Even if the genericPet right now is a cat,it cannot access the makeASound(String) because that is a method on Cat not Pet. 
		//genericPet.makeASound("treat");
		System.out.println("\nDOG POLYMORPHISM");
		genericPet=new Dog("The new Spike","Dog");
		System.out.println(genericPet.toString());
		genericPet.makeASound();
		genericPet.sleep();
}
}
