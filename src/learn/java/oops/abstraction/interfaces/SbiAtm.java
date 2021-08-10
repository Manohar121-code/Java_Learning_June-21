package learn.java.oops.abstraction.interfaces;

public class SbiAtm implements ATMMachine {

	@Override
	public void withdraw() {
		System.out.println("Withdrawing from SBI Atm");
	}

	@Override
	public double checkBalance() {
		System.out.println("Checking the account balance in SBI Atm");
		return 200;
	}

	@Override
	public void changePin() {
		System.out.println("Changing the pin in SBI Atm");
	}

}
