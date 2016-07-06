package model.transporte;

import model.Transporte;

public class Triciclo extends Transporte {

	public Triciclo() {
		super(3);
		// TODO Auto-generated constructor stub
		System.out.println(toString());
		mover();

		
	}

	@Override
	public void mover() {
		System.out.println("Ruedo en 3 ruedas");
		
	}

}
