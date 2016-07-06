import interfaces.Movimiento;

import java.util.Scanner;

import model.servivo.Ballena;
import model.servivo.Cobra;
import model.servivo.Coralillo;
import model.servivo.Persona;
import model.servivo.Raton;
import model.transporte.Automovil;
import model.transporte.Avion;
import model.transporte.Bicicleta;
import model.transporte.Motocicleta;
import model.transporte.Triciclo;

public class Principal {
	final static int PERSONA=1;
	final static int RATON=2;
	final static int AVION=3;
	final static int AUTOMOVIL=4;
	final static int COBRA=5;
	final static int CORALILLO=6;
	final static int BICICLETA=7;
	final static int MOTOCICLETA=8;
	final static int BALLENA=9;
	final static int TRICICLO=10;
	
	public static void main (String arg[]){
	int opc=0;
	Scanner sc=new Scanner(System.in);
	Movimiento m=null;
	do{
		System.out.println("1 Persona "+
					"2.	Raton"+
					"3.	Avion"+
					"4.	Automovil"+
					"5.	Cobra"+
					"6.	Coralillo."+	
					"7.	Bicicleta."+
					"8.	Motocicleta"+
					"9.	Ballena"+
					"10.	Triciclo");
		opc=sc.nextInt();
		switch(opc){
		case PERSONA:m=new Persona();
			break;
		case RATON:m=new Raton();
			break;
		case AVION:m=new Avion();
			break;
		case AUTOMOVIL:m=new Automovil();
			break;	
		case COBRA:m=new Cobra();
			break;
		case CORALILLO:m=new Coralillo();
			break;
		case BICICLETA:m=new Bicicleta();
			break;
		case MOTOCICLETA:m=new Motocicleta();
			break;
		case BALLENA:m=new Ballena();
			break;
		case TRICICLO:m=new Triciclo();
			break;	
		}
		
	}while(opc!=11);
}
}
