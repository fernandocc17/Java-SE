//https://github.com/fernandocc17, July 2016.
public class Gato extends Mascota{

	public Gato(String n, String fecha, String raza) {
		super(n, fecha, raza);
		// TODO Auto-generated constructor stub
	}

	public Gato(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	@Override
	void dormir() {
		super.dormir();
		System.out.println("de dia");
	}
	@Override
	void emitirSonido() {
		super.emitirSonido();
		System.out.println(" maullando");
	}
}