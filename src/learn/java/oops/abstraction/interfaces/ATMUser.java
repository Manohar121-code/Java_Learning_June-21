package learn.java.oops.abstraction.interfaces;

public class ATMUser {
	public static void main(String[] args) {
		ATMMachine hdfc = new HdfcAtm();
		
		double hdfcBalance = hdfc.checkBalance();
		System.out.println("HDFC Account Balance - "+ hdfcBalance);
		
		hdfc.withdraw();
		hdfc.changePin();
		
		System.out.println("---------------");
		
		ATMMachine sbiAtm = new SbiAtm();
		System.out.println("SBI Account Balance - "+ sbiAtm.checkBalance());
		
		sbiAtm.withdraw();
		sbiAtm.changePin();
	}
}
