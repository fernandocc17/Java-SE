package model.transporte;

import model.Transporte;

public class Bicicleta extends Transporte {

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Ruedo como bici");

	}
	
	public Bicicleta(){
		super(2);
		System.out.println(toString());
		mover();

	}


}
