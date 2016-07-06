package model.transporte;

import model.Transporte;

public class Motocicleta extends Transporte {

	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println("Ruedo como moto");

	}
	
	
	public Motocicleta(){
		super(2);
		System.out.println(toString());
		mover();

	}

}
