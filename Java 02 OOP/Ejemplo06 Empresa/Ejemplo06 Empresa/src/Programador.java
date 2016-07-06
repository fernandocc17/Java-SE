//https://github.com/fernandocc17, July 2016.
public class Programador extends Empleado{

	public Programador(String nombre, String salario, String puesto) {
		super(nombre, salario, puesto);
		// TODO Auto-generated constructor stub
	}

	@Override
	void trabajar() {
		System.out.println("Programar");
	}
	
	void serPerfecto(){
		System.out.println("42");
	}

	public Programador(String nombre, String puesto) {
		super(nombre, puesto);
		// TODO Auto-generated constructor stub
	}

}
