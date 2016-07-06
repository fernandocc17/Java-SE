package model.transporte;

import model.Transporte;

public class Avion extends Transporte {

	@Override
	public void mover() {
		System.out.println("Vuelo como un avion");
		
	}
	public Avion(){
		super(8);
		System.out.println(toString());
		mover();

		
	}


}
