//https://github.com/fernandocc17, July 2016.
public class Secretaria extends Empleado{

	public Secretaria(String nombre, String salario, String puesto) {
		super(nombre, salario, puesto);
		// TODO Auto-generated constructor stub
	}

	public Secretaria(String nombre, String puesto) {
		super(nombre, puesto);
		// TODO Auto-generated constructor stub
	}

	@Override
	void trabajar() {
		System.out.println("tomar dictado , enviar oficios , revisar correos , ver fb");

}
	
	void hacerAlgo(){
		
	}
}