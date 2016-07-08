//https://github.com/fernandocc17, July 2016.
public class Account {
double balance;

public void setBalance(double balance) {
	//This is removed when it goes to production.
	//The conditional must be true otherwise the assert will trigger and will show the stacktrace as an exception
	assert(balance>0):"The balance must be positive and it is: "+ balance;
	//this is the path that should be followed.
	this.balance = balance;
}


	
}
