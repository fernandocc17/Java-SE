
public class NoMoneyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8818612249581743618L;
	//we just need to extend from the general exception: "Exception" to make our own exception.
	//We will overwrite the no args constructor to print our own message
	public NoMoneyException(){
		System.out.println("Your account cannot be negative.");
	}
}
