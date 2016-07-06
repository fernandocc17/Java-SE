import java.util.Comparator;


public class OrdenaPersona implements Comparator <Persona>{

	//Forma generica para cualquier objeto
	/*@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return 0;
	}*/
	//forma generada para objetos de persona

	@Override
	public int compare(Persona arg0, Persona arg1) {

		return arg1.edad-arg0.edad;
	}

}
