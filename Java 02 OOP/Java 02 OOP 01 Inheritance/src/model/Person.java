//https://github.com/fernandocc17, July 2016.

package model;
//This class is a POJO(Plain Old Java Object), is a class that only has variables and getters/setters
public class Person {
//Instance variables	
private String name,lastName1,lastName2;
public String rfc;
String bDay;
//Constructor method, it receives all the data needed to create the object.
public Person(String name,String lastName1,String lastName2,String bDay){
	//The "this" makes the refer to the instance variables and not the parameters.
	this.name=name;
	this.lastName1=lastName1;
	this.lastName2=lastName2;
	this.bDay=bDay;
	//creates the RFC(An id on Mexico)
	this.rfc=lastName1.substring(0,2)+ lastName2.substring(0, 1)+
			name.substring(0,1)+ bDay;	
}
//The following methods are known as getters and setters or mutators.
//They allow to encapsulate the variables and do some refactor on the future. 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
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
public String getbDay() {
	return bDay;
}
public void setbDay(String bDay) {
	this.bDay = bDay;
}
}