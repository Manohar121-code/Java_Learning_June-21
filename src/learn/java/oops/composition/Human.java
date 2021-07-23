package learn.java.oops.composition;

public class Human {
	private String name;
	private int hieght;

	// brain
	private Brain brain;

	// heart
	private Heart heart;
	
	public Human(String name, int hieght, Brain brain, Heart heart) {
		this.name = name;
		this.hieght = hieght;
		this.brain = brain;
		this.heart = heart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHieght() {
		return hieght;
	}

	public void setHieght(int hieght) {
		this.hieght = hieght;
	}

	public Brain getBrain() {
		return brain;
	}

	public void setBrain(Brain brain) {
		this.brain = brain;
	}

	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

}
