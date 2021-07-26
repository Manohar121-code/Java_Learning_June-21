package learn.java.oops.inheritance.multiLevel;

public class Car extends Vehicle {
	private int numOfGears;
	private int numOfSeats;
	private boolean isBackLobbyThere;

	public int getNumOfGears() {
		return numOfGears;
	}

	public void setNumOfGears(int numOfGears) {
		this.numOfGears = numOfGears;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public boolean isBackLobbyThere() {
		return isBackLobbyThere;
	}

	public void setBackLobbyThere(boolean isBackLobbyThere) {
		this.isBackLobbyThere = isBackLobbyThere;
	}

}
