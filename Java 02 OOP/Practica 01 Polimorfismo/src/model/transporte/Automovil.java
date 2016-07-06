package model.transporte;

import model.Transporte;

public class Automovil extends Transporte {

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Me muevo en 4 ruedas");

	}
	
	public Automovil(){
		super(4);
		System.out.println(toString());
		mover();
	}


}
