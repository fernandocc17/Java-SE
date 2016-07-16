package enums;
//https://github.com/fernandocc17, July 2016.
//Enums has fixed values that are constants.
public enum Days {SUNDAY(0),
				  MONDAY(1),
				  TUESDAY(2),
				  WEDNESDAY(3),
				  THURSDAY(4),
				  FRIDAY(5),
				  SATURDAY(6);
final int value;
public int getValue() {
	return value;
}
//Enum can have a constructor with fixed constants but only with default access modifier or private
Days (int value){
	this.value=value;
}
//Can have methods like any other class.
public void print(){
	System.out.println(value);
}
}