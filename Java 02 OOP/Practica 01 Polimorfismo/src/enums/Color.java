package enums;

public enum Color {
BLANCO("Es blanco"),NEGRO("Es negro"),ROJO("Es rojo");
String msg;
private Color(String msg){
	this.msg=msg;
}
}
