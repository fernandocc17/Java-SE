//https://github.com/fernandocc17, July 2016.
public class Main {
	public static void main(String[] args) {
		String string="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur viverra nisl vehicula ligula vestibulum tempus.";
		String stringArray[]=string.split(" "); 
		for(String tmp: stringArray){
			System.out.println(tmp);
		}
	}

}
