//https://github.com/fernandocc17, July 2016.
import java.util.StringTokenizer;
public class Main {
	public static void main(String[] args) {
		String string="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur viverra nisl vehicula ligula vestibulum tempus.";
		//must receive at least the string to be parsed.
		//the default delimiters are white-space, tab and new line
		StringTokenizer st=new StringTokenizer(string);
		System.err.println("Default delimiters");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		System.out.println();
		System.out.println("Default , and . delimiters");
		//setting , and . as delimiters.
		st=new StringTokenizer(string,",.");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
		System.out.println();
		//in any moment the delimiter can be changed with st.nextToken()
		
	}
}