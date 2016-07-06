
public class Persona {
String nombre;
int edad;

public String getNombre() {
	return nombre;
}
public Persona(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
@Override
public String toString() {
	
	return "Nombre"+ nombre+ "edad"+ edad;
}



}
