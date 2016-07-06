//https://github.com/fernandocc17, July 2016.
public class Recepcionista extends Empleado{

	public Recepcionista(String nombre, String salario, String puesto) {
		super(nombre, salario, puesto);
		// TODO Auto-generated constructor stub
	}

	public Recepcionista(String nombre, String puesto) {
		super(nombre, puesto);
		// TODO Auto-generated constructor stub
	}

	@Override
	void trabajar() {
		System.out.println("Recibe");
	}

}
