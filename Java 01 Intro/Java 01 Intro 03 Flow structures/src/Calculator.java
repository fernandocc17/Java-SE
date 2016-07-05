//https://github.com/fernandocc17, July 2016.
import java.util.Scanner;


public class Calculator {
	//Declaracion de las variables de la clase, mejor conocidas como atributos o estados
	int n1,n2;
	boolean band=false;
	//Declaracion de las funciones y procedimientos de la clase , mejor conocidos como metodos o compartamiento.
	void sumar(){
		//Creamos un objeto local de la clase Scanner para poder leer los valores de entrada.
		Scanner sc=new Scanner (System.in);

		//definimos nuestras variables locales necesarias
		int a,b,res;
		//Pedimos los valores al usuario
		System.out.println("Dame dos numeros");
		a=sc.nextInt();
		b=sc.nextInt();
		//hacemos la operacion correspondiente con los datos ingresados por el usuario
		res=a+b;
		//Le damos salida al resultado de nuestra operacion
		System.out.println("El resultado de la suma es "+ res);
		
	}
	void pideDatos(){
		//Al darnos cuenta que para todas las operaciones tendremos que pedir dos datos 
		//declarar de forma local un scanner, podemso ahorrarnos eso si creamos un metodo
		//que se encargue de pedir los datos siempre y guardarlos en los atributos de la clase
		
		
		System.out.println("Dame dos numeros");
		Scanner sc=new Scanner (System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();	
	}
	void restar(){
		//aprovechamos el metodo pideDatos(); para escribir menos codigo y hacer mas legible el programa
		pideDatos();
		System.out.println("La resta es: "+(n1-n2));
	}
	
	//declaramos el metodo dividir(); , el cual nos regresara un valor int
	int dividir(){
		//Pedimos los datos al usuario
		pideDatos();
		//Si el divisor es igual a cero
		if (n2==0)
		{
			//activamos nuestra bandera y devolvemos un valor entero cualesquiera, en este caso 0
			band=true;
			return 0;
			
		}
		//si el divisor fue distinto de 0 podemos realizar la division y devolver ese resultado int
		else
		{
			return n1/n2;
		}
			
		
	}
	
	public static void main (String a[] ){
		//Creamos el objeto sc para leer las opciones introducidas por el usuario
		Scanner sc=new Scanner (System.in);
		//declaramos una variable que nos sirve para guardar la opcion elegida por el usuario y res que sera nuestro acumulador
		int opc = 0,res=0;
		//Creamos un objeto c de la clase calculadora
		Calculator c=new Calculator();
		//Mostramos un menu al usuario con las operaciones matematicas basicas,
		//dependiendo de la opcion elegida se realizara la operacion
		do{
			System.out.println("1-Sumar         \n" +
							  "2-Restar		    \n" +
							  "3-Multiplicar	\n" +
							  "4-Dividir		\n"+
							  "5-Salir");
		opc=sc.nextInt();
		//Seleccionamos el caso a usar por medio de la variable opc
		switch (opc){
		//En el caso 1 se manda a llamar al metodo sumar del objeto c y esperamos que el resuelva todo
			case 1:c.sumar();
					break;
			case 2:c.restar();
					break;
		//En el caso 3 , pedimos los datos al usuario y utilizamos un for para calcular el resultado de la multiplicacion
		//mediante sumas sucesivas
			case 3:c.pideDatos();
					for (int i=0;i<c.n1;i++)
						res+=c.n2;
					System.out.println("La multiplicacion es: "+res);
						
					break;
		//Llamamos al metodo dividir y guardamos el valor que nos envia en res
			case 4:res=c.dividir();
					//evaluamos la bandera , de estar apagada quiere decir que el divisor no es cero y la division fue exitosa
					if (!c.band)
						System.out.println(res);
					//Sino lo es , el divisor fue 0 y mostramos un msg
					else
						System.out.println("No se puede dividir entre cero");
						
					break;
		//En el caso de que el usuario decida terminar el programa			
			case 5:System.out.println("Adios!"); 		
					break;
		//Si el usuario eligio un caso que no programamos			
			default:System.out.println("No existe opcion"); 
		}
		//Mientras el usuario no elija la opcion 5 se repetira el programa	
		}while(opc!=5);
	}
}
