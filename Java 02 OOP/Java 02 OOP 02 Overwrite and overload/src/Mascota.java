import java.util.Date;

//https://github.com/fernandocc17, July 2016.
public class Mascota {
String nombre;
String fNac;
String especie;
String raza;
String genero;
String tamano;
String color;

public Mascota(String n,String fecha,String raza){
	this.nombre=n;
	this.fNac=fecha;
	this.raza=raza;
}

public Mascota(String n){
	this.nombre=n;
	Date d=new Date();
	fNac=Long.toString(d.getTime());
}


public void correr(){
	}
public void morder(){
	
}
public void saltar(){
	
}
public void comer(){
	
}
public void cazar (){
	
}
void dormir(){
	System.out.print("Estoy durmiendo ");
}
void emitirSonido(){
System.out.print("Estoy ");	
}
void defecar (){
	
}
void jugar(){
	
}
void reproducir (){
	
}
void morir(){
	
}
void enfermar(){
	
}
}//fin clase