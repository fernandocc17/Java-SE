package model;

import java.util.Scanner;

import interfaces.Movimiento;
import enums.Color;

public abstract class Transporte implements Movimiento{
protected final int RUEDAS;
Color color;
protected int radio;
public Transporte(int ruedas) {
	super();
	Scanner sc=new Scanner(System.in);
	int color;
	System.out.println("Radio:");
	radio=sc.nextInt();
	System.out.println("1Blanco,2Negro,3Rojo");
	color=sc.nextInt();
	switch(color){
	case 1:this.color=Color.BLANCO;
		break;
	case 2:this.color=Color.NEGRO;
		break;
	case 3:this.color=Color.ROJO;
		break;
	}
	this.RUEDAS=ruedas;
	System.out.println(toString()+calcularAreaRuedas());	
}
@Override
public String toString() {
	return "Transporte [RUEDAS=" + RUEDAS + ", color=" + color + ", radio="
			+ radio + "]";
}
public double calcularAreaRuedas(){
	return 3.15*radio*radio*RUEDAS;
}
}
