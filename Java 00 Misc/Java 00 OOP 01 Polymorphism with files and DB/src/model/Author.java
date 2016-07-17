//https://github.com/fernandocc17, July 2016.
package model;
import java.util.StringTokenizer;
public class Author {
	private String firstName;
	private String lastName1;
	private String lastName2;
	public Author(){}
	public Author(String line){
		StringTokenizer st=new StringTokenizer(line,"|");
		setFirstName(st.nextToken());
		setLastName1(st.nextToken());
		setLastName2(st.nextToken());
	}
	@Override
	public String toString() {
		return firstName+ "|"+ lastName1 + "|"+lastName2;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName1() {
		return lastName1;
	}
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}
	public String getLastName2() {
		return lastName2;
	}
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
}