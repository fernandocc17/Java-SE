//https://github.com/fernandocc17, July 2016.
public class Persona {
private String nombre,aMaterno,aPaterno;
String domicilio;
String eMail;
String estadoCivil;
String rfc;
String telefono;
String compania;
String curp;
String nacionalidad;
String entidad;
String fNac;
String genero;

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getaMaterno() {
	return aMaterno;
}
public void setaMaterno(String aMaterno) {
	this.aMaterno = aMaterno;
}
public String getaPaterno() {
	return aPaterno;
}
public void setaPaterno(String aPaterno) {
	this.aPaterno = aPaterno;
}

public Persona(String nombre,String aPaterno,String aMaterno,String fNac){
	this.nombre=nombre;
	this.aMaterno=aPaterno;
	this.aPaterno=aMaterno;
	this.fNac=fNac;
	
	this.rfc=aPaterno.substring(0,2)+ aMaterno.substring(0, 1)+
			  nombre.substring(0,1)+ fNac;
	
}

	
}
