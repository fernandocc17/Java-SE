import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Dias d = null;
		int dia = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Que dia de la semana quieres");
		dia = sc.nextInt();
		switch (dia) {
		case 1:
			d = Dias.DOMINNGO;
			break;
		case 2:
			d = Dias.LUNES;
			break;
		case 3:
			d = Dias.MARTES;
			break;
		case 4:
			d = Dias.MIERCOLES;
			break;
		case 5:
			d = Dias.JUEVES;
			break;
		case 6:
			d = Dias.VIERNES;
			break;
		case 7:
			d = Dias.SABADO;
			break;
		default:
			System.out.println("Dia invalido");
		}
		System.out.println(d);
	}

}
