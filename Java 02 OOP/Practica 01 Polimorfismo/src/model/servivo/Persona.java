package model.servivo;

import model.SerVivo;

public class Persona extends SerVivo {
	@Override
	public void mover() {
		System.out.println("Camino erguido");
		
	}
	
	public Persona() {
		super();
		mover();
		System.out.println(toString());

	}

}
