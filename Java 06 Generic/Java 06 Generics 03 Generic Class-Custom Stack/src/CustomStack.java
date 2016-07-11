//https://github.com/fernandocc17, July 2016.
//The class is a generic class, that means this stack can hold any object type.
public class CustomStack <T>{
	final int SIZE;
	int top;
	private T [] arrayT;
	@SuppressWarnings("unchecked")
	//Constructor method initializing the array
	public CustomStack ( int t){
		SIZE=t;
		top=-1;
		//Casting the object class/type to a T type
		arrayT= ((T[]) new Object [SIZE]);
	}
	public T pop (){
		if (top ==-1){
			System.out.println("Stack full");
			return null;
		}
		else{
			System.out.println(arrayT[top]);
			return arrayT[top--];
		}
	}
	public void push(T value){
		if (SIZE -1 !=top){
			System.out.println("Added "+value);
			arrayT[++top]=value;
		}
		else{
			System.out.println("Unable to add "+value);
		}
	}
}