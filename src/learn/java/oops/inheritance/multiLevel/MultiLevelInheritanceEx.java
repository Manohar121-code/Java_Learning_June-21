package learn.java.oops.inheritance.multiLevel;

public class MultiLevelInheritanceEx {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle();
		v1.setEngine("Good");
		v1.setNumOfDoors(4);
		v1.setNumOfWheels(4);
		
		System.out.println("*************** VEHICLE Properties ***************");
		System.out.println(v1.getEngine());
		System.out.println(v1.getNumOfDoors());
		System.out.println(v1.getNumOfWheels());
		
		Car creta = new Car();
		creta.setNumOfGears(5);
		creta.setBackLobbyThere(true);
		creta.setEngine("Good");
		creta.setNumOfDoors(5);
		creta.setNumOfSeats(5);
		creta.setNumOfWheels(4);
		
		System.out.println("********** CRETA Properties *********");
		System.out.println(creta.getEngine());
		System.out.println(creta.getNumOfDoors());
		System.out.println(creta.getNumOfGears());
		System.out.println(creta.getNumOfWheels());
		System.out.println(creta.getNumOfSeats());
		System.out.println(creta.isBackLobbyThere());
		
		SuperCar bugatti = new SuperCar();
		bugatti.setBackLobbyThere(true);
		bugatti.setEngine("Good");
		bugatti.setNumOfDoors(2);
		bugatti.setNumOfGears(6);
		bugatti.setNumOfSeats(2);
		bugatti.setNumOfWheels(4);
		bugatti.setRoofAvailable(true);
		bugatti.setTopSpeed(400);
		
		System.out.println("************ BUGATTI Properties ***********");
		System.out.println(bugatti.getEngine());
		System.out.println(bugatti.getNumOfDoors());
		System.out.println(bugatti.getNumOfGears());
		System.out.println(bugatti.getNumOfSeats());
		System.out.println(bugatti.getNumOfWheels());
		System.out.println(bugatti.getTopSpeed());
		System.out.println(bugatti.isBackLobbyThere());
		System.out.println(bugatti.isRoofAvailable());
	}
}
