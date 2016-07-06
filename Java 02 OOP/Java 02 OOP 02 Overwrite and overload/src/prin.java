//https://github.com/fernandocc17, July 2016.
public class prin {
 
	public static void main (String[] args ){

		Perro firulais=new Perro ("firulais");
		Perro buster=new Perro("buster","11 de junio del 2000","Boxer");
		Perro killer=new Perro("killer","hace un a–o","Pastor aleman","Macho");
		
		//Creacion de un gato con el constructor de solo nombre, llamada al superconstructor
		Gato garfield=new Gato("garfield");
		
		//Creacion de un gato con el constructor de nombre , fecha y genero , llamada al superconstructor
		Gato felix=new Gato("felix","1 de enero del 35","cartoon");
		
		//llamada al metodo dormir de perro que tiene override
		firulais.dormir();
		
		//llamada al metodo dormir de perro que tiene overload, recibiendo cuantas horas va a dormir
		buster.dormir("4");
		
		//llamada al metodo emitirSonido de perro que usa el super metodo y luego especializa.
		killer.emitirSonido();
		//llamada a metodo dormir que tiene override de mascota.
		garfield.dormir();
		//Llamada a metodo emitirSonido que gato especializa de su superclase mascota.
		felix.emitirSonido();
		
		
		
}
}
