
public class Cuenta {

	double balance;

	public Cuenta(double balance) {
		super();
		try {
			setBalance(balance);
		} catch (sinFondoExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) throws sinFondoExcepcion{
		if (balance<0)
			throw new sinFondoExcepcion();
		this.balance = balance;
	}
	
	
}
