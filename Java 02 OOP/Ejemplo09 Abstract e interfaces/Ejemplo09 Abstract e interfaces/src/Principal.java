import interfaces.Respirar;

import java.util.Scanner;

import mineral.Cobre;
import mineral.Hidrogeno;
import mineral.Mineral;
import mineral.Oro;
import mineral.Oxigeno;
import mineral.Plutonio;
import mineral.Uranio;

import vegetal.Cedro;

import animal.Humano;
import animal.PezPayaso;


public class Principal {

	public static void main(String[] args) {
		int opc=0;
		
		Scanner sc=new Scanner(System.in);
		Respirar r=null;
		Mineral m=null;
		System.out.println("Menu");
		System.out.println("1.-Pez Payaso");
		System.out.println("2.- Humano");
		System.out.println("3.- Cedro");
		System.out.println("4.- Uranio");
		System.out.println("5.- Plutonio");
		System.out.println("6.- Oro");
		System.out.println("7.- Cobre");
		System.out.println("8.- Oxigeno");
		System.out.println("9.- Hidrogeno");
		opc=sc.nextInt();
		
	
		switch (opc){
		case 1:r=new PezPayaso();
				
		break;
		case 2:r=new Humano();
			
		break;
		case 3:
			r=new Cedro();
		break;
		case 4:
			m=new Uranio();
		break;
		case 5:
			m=new Plutonio();
		break;
		case 6:
			m=new Oro();
		break;
		case 7:
			m=new Cobre();
		break;
		case 8:
			m=new Oxigeno();
		break;
		case 9:
			m=new Hidrogeno();
		break;			
		default:
		System.out.println("opcion invalida");
		
		}
		
		
/*		switch(opc){
		case 1:PezPayaso p=new PezPayaso();
			break;
		case 2:Humano h=new Humano();
			break;
		case 3:
				Cedro c=new Cedro();
			break;
		case 4:
				Uranio u=new Uranio();
			break;
		case 5:
				Plutonio pl=new Plutonio();
			break;
		case 6:
				Oro o=new Oro();
			break;
		case 7:
				Cobre co=new Cobre();
			break;
		case 8:
				Oxigeno ox=new Oxigeno();
			break;
		case 9:
				Hidrogeno hi=new Hidrogeno();
			break;			
		default:
			System.out.println("opcion invalida");
		}
*/
		
		
	}

}
