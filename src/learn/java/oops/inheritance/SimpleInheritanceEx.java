package learn.java.oops.inheritance;

public class SimpleInheritanceEx {
	public static void main(String[] args) {
		Parent p = new Parent();
		
		Child c = new Child();
		c.setId(1);
		c.setName("Ravi");
		c.setAge(23);
		c.setCity("Bangalore");
		
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getAge());
		System.out.println(c.getCity());
	}
}
