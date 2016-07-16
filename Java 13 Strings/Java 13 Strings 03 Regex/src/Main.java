//https://github.com/fernandocc17, July 2016.
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
		String string="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur viverra nisl vehicula ligula vestibulum tempus.";
		//Create the pattern to search
		Pattern pattern=Pattern.compile("[\\.]");
		//create a matcher from the pattern while giving the pattern the string to analyze
		Matcher matcher=pattern.matcher(string);
		//this checks if a match is in the string
		/*if(matcher.find()){
			System.out.println("Found");
		}*/
		
		//this will iterate through the searching for any match and printing them
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}
}