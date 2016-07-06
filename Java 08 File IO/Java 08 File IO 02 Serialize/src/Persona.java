import java.io.Serializable;


public class Persona implements Serializable{

private static final long serialVersionUID = 446853974294240111L;
String nombre;
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "La persona es: "+ nombre+ " tiene "+ edad+ " a–os y gana "+ salario;
}

int edad;
double salario;

public Persona(String nombre, int edad, double salario) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.salario = salario;
}

}
