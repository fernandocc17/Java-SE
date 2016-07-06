package vegetal;

import interfaces.Alimentar;
import interfaces.Respirar;

public abstract class Vegetal implements Alimentar,Respirar{

	public void respirar(){
		System.out.println("CO2----->O2");
		
	}


	public void alimentar() {
		
	}
	
	public Vegetal(){
		respirar();
	}
	
}
