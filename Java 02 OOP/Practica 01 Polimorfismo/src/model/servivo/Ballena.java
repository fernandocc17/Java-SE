package model.servivo;

import model.SerVivo;

public class Ballena extends SerVivo {
	@Override
	public void mover() {
		System.out.println("Nado como ballena");
		
	}

	public Ballena() {
		super();
		mover();
		System.out.println(toString());
	}
	
	
}
