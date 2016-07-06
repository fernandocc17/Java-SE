import static java.lang.Math.PI;
public class Principal {

	
	public static void main(String[] args) {
	int n;
	double r;
	System.out.println("Cuantos incendios quieres crear");
	//Metodo static no es necesario instanciar la clase
	n=Lectora.leeInt();
	incendio inc=null;
	for(int i=0;i<n;i++){
		 inc=new incendio();
	}
	
	System.out.println("Dame el radio de un circulo");
	r=Lectora.leeInt();
	r=(r*r*PI);
	System.out.println("El area mide"+ r );
	}
	

}
