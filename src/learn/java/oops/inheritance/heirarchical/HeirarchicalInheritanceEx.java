package learn.java.oops.inheritance.heirarchical;

public class HeirarchicalInheritanceEx {
	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.setGender("Male");
		obj.setHeight(6);
		obj.setWeight(100);
		
		System.out.println("########### Animal Properties ##########");
		System.out.println(obj.getGender());
		System.out.println(obj.getHeight());
		System.out.println(obj.getWeight());
		
		Human mahesh = new Human();
		mahesh.setGender("Male");
		mahesh.setHeight(6);
		mahesh.setIq(4);
		mahesh.setName("Mahesh");
		mahesh.setWeight(70);
		
		System.out.println("############ Human Properties ###########");
		System.out.println(mahesh.getGender());
		System.out.println(mahesh.getHeight());
		System.out.println(mahesh.getIq());
		System.out.println(mahesh.getName());
		System.out.println(mahesh.getWeight());
		
		Dog rott = new Dog();
		rott.setGender("Female");
		rott.setHeight(2);
		rott.setWeight(80);
		rott.setColour("Black");
		rott.setBreed("Rott Wieller");
		
		System.out.println("########### Dog Properties ############");
		System.out.println(rott.getGender());
		System.out.println(rott.getHeight());
		System.out.println(rott.getWeight());
		System.out.println(rott.getColour());
		System.out.println(rott.getBreed());
	}
}
