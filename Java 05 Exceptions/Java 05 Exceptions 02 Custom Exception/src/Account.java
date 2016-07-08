//https://github.com/fernandocc17, July 2016.
public class Account {
	private double balance;
	public double getBalance() {
		return balance;
	}
	//
	public void setBalance(double balance) throws NoMoneyException{
		if (balance<0){
			//this line throws the new exception.
			throw new NoMoneyException();
			//the line itself must be surrounded with a try-catch block or the method should have the throws modifier at the end., that way every line that call this knows
			//that it must be surrounded with a try-catch block or propagate the exception 
		}else{
			this.balance = balance;
		}
	}
}
