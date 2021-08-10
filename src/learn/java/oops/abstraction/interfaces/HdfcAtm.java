package learn.java.oops.abstraction.interfaces;

public class HdfcAtm implements ATMMachine {

	@Override
	public void withdraw() {
		System.out.println("Withdrawing from HDFC Atm");
	}

	@Override
	public double checkBalance() {
		System.out.println("Checking the account balance in HDFC Atm");
		return 100;
	}

	@Override
	public void changePin() {
		System.out.println("Changing the pin in HDFC Atm");
	}

}
