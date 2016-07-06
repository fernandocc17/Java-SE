
public class Lifo <T>{

	final int TAMANO;
	int superior;
	private T [] elementos;
	
	public Lifo ( int t){
		TAMANO=t;
		superior=-1;
		elementos= (T[]) new Object [TAMANO];
	}
	
	public T pop (){
		if (superior ==-1)
			return null;
		else
			return elementos[superior--];
		
	}
	public void push(T valor){
		if (TAMANO -1 !=superior)
			elementos[++superior]=valor;
		
	}
}
