package learn.java.oops.inheritance.multiLevel;

public class SuperCar extends Car {
	private int topSpeed;
	private boolean isRoofAvailable;

	public int getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(int topSpeed) {
		this.topSpeed = topSpeed;
	}

	public boolean isRoofAvailable() {
		return isRoofAvailable;
	}

	public void setRoofAvailable(boolean isRoofAvailable) {
		this.isRoofAvailable = isRoofAvailable;
	}

}
