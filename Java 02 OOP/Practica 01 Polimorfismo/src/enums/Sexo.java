package enums;

public enum Sexo {
MASCULINO("Es un hombre"),FEMENINO("Es una mujer");
String msg;
private Sexo(String msg){
	this.msg=msg;
}
}
