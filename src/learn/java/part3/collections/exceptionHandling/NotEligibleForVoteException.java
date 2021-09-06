package learn.java.part3.collections.exceptionHandling;

public class NotEligibleForVoteException extends Exception {

	public NotEligibleForVoteException() {
		super();
	}
	
	public NotEligibleForVoteException(String msg) {
		super(msg);
	}
	
	public NotEligibleForVoteException(Throwable t) {
		super(t);
	}
}
