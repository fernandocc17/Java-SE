//https://github.com/fernandocc17, July 2016.
public class Jefe extends Empleado{

	public static void main(String[] args) {

		Jefe jefazo=new Jefe("jefazo","jefe de jefes");
		jefazo.trabajar();
		
	}

	@Override
	void trabajar() {

	Empleado e;
	e=new Secretaria("Secre","Secretaria");
	e.trabajar();

	e=new Recepcionista("Mariana","Recepcionista");
	e.trabajar();
	
	e=new Profesor("Fernando","Profesor");
	e.trabajar();
	
	e=new Programador("Perfect"," programa todo");
	e.trabajar();
	//tratamos de invocar al metodo serPerfecto() del programador
	//e.serPerfecto();
	//No se puede invocar xq el metodo serPerfecto() solo existe en la clase Programador no en Empleado
	
	
	}

	public Jefe(String nombre, String salario, String puesto) {
		super(nombre, salario, puesto);
		// TODO Auto-generated constructor stub
	}

	public Jefe(String nombre, String puesto) {
		super(nombre, puesto);
		// TODO Auto-generated constructor stub
	}

}
