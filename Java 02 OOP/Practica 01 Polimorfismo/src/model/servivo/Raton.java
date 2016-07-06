package model.servivo;

import model.SerVivo;

public class Raton extends SerVivo {
	@Override
	public void mover() {
		System.out.println("Me muevo por las alcantarillas");
		
	}
	
	public Raton() {
		super();
		mover();
		System.out.println(toString());

	}

}
