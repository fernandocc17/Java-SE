package model.servivo;

import model.SerVivo;

public class Coralillo extends SerVivo {
	@Override
	public void mover() {
		System.out.println("Me arrastro como coralillo");
		
	}
	public Coralillo() {
		super();
		mover();
		System.out.println(toString());

	}

}
