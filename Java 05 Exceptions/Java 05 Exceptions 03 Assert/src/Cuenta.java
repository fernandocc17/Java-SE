
public class Cuenta {
double Balance;

public Cuenta(double Balance){
	setBalance(Balance);
	
}
public double getBalance() {
	return Balance;
}

public void setBalance(double balance) {
	//Cuando salga a produccion quitar el assert
	//Probablemente poner un try-catch
	assert(balance>0):"El balance debe ser positivo"+ balance;
	Balance = balance;
}


	
}
