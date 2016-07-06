//https://github.com/fernandocc17, July 2016.
public class Perro extends Mascota{

	public Perro(String n, String fecha, String raza) {
		super(n, fecha, raza);
		// TODO Auto-generated constructor stub
	}
	
	public Perro(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	public Perro(String n, String fecha, String raza,String sexo) {
		super(n, fecha, raza);
		this.genero=sexo;
		// TODO Auto-generated constructor stub
	}

	@Override
	void dormir() {
		super.dormir();
		System.out.println(" de noche");
	}

	void dormir(String horas){
		System.out.println("Me voy a dormir por "+ horas);
		
	}
	@Override
	void emitirSonido() {
		// TODO Auto-generated method stub
		super.emitirSonido();
		System.out.println(" ladrando");
		
	}

}
