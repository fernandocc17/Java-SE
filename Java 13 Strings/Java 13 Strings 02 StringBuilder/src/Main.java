//https://github.com/fernandocc17, July 2016.
public class Main {
public static void main (String [] args){
	//Since strings are immutable whenever a concatenation with + is performed, a new string gets generated.
	String a="a",b="b",c="c",d="d",e="e",f="f",g="g";
	@SuppressWarnings("unused")
	String z;
	//if we want to create a string "abcdefg" and store it on "z" we will create the following 
	//z=a+b+c+d+e+f+g;
	//ab,abc,abcd,abcde,abcdef,abcdefg 
	//we wanted to create only one new string but we ended up creating 5 additionals strings.
	//this can seem trivial but doing it on a cycle can end up wasting a lot of memory
	StringBuilder sb=new StringBuilder(a);
	//StringBuilder avoids this problem, since this actually uses just one reference to hold the value.
	//The constructor method can receive a String
	sb.append(b);
	sb.append(c);
	sb.append(d);
	sb.append(e);
	sb.append(f);
	sb.append(g);
	//StringBuilder cannot be casted directly to String, it needs to be converted to string
	System.out.println(sb.toString());
}
} 