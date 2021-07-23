package learn.java.oops.composition;

public class CompositionEx {
	public static void main(String[] args) {
		
		Brain maheshBrain = new Brain(1000, 4);
		Heart maheshHeart = new Heart(4, true);
		
		Human mahesh = new Human("Mahesh", 6, maheshBrain, maheshHeart);
		String name = mahesh.getName();
		int hieght = mahesh.getHieght();
		System.out.println(name);
		System.out.println(hieght);
		
		Brain brain = mahesh.getBrain();
		System.out.println(brain.getNumOfNeurons());
		System.out.println(brain.getIq());
		
		Heart heart = mahesh.getHeart();
		System.out.println(heart.getNumOfRooms());
		System.out.println(heart.isQuality());
		
		System.out.println(maheshBrain);
		System.out.println(brain);
	}
}
