//https://github.com/fernandocc17, July 2016.
public class Profesor extends Empleado{

	public Profesor(String nombre, String salario, String puesto) {
		super(nombre, salario, puesto);
		// TODO Auto-generated constructor stub
	}

	public Profesor(String nombre, String puesto) {
		super(nombre, puesto);
		// TODO Auto-generated constructor stub
	}

	@Override
	void trabajar() {

		System.out.println("Dar clases de Java");
	}

}
