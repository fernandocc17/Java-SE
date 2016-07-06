package model.servivo;

import model.SerVivo;

public class Cobra extends SerVivo {

	@Override
	public void mover() {
		System.out.println("Me arrastro como cobra");
		
	}
	public Cobra() {
		super();
		mover();
		System.out.println(toString());

	}

}
