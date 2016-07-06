
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Instanciamos la ventana
		Ventana v=new Ventana();
		//Definimos el tama–o de nuestra ventana
		v.setSize(255,255);
		//Hacemos visible la ventana
		v.setVisible(true);
		//especificamos que hacer en caso que den click en cerrar
		v.setDefaultCloseOperation(v.EXIT_ON_CLOSE);
		
	}

}
