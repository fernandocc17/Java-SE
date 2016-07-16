//https://github.com/fernandocc17, July 2016.
public class Main {
	public static void main(String[] args) {
		int size=0;
		//Strings are immutable, they won't change.
		String test="Hello world from the other side";
		System.out.println("Character at index 6="+test.charAt(6));
		//Whenever we do something like that, we access the char array behind the actual String, if u plan to do it a lot is better to convert the string to a char Array.
		char [] testArray=test.toCharArray();
		//note  that this is not a method, is a variable,so no harm on putting it on a cycle.
		size=testArray.length;
		System.out.println("String size "+size);
		//Converting the char array to a string again.
		test=String.valueOf(testArray);
		//String.valueOf can be used with most primitives.
		System.out.println(test);
	}
}