package learn.java.basic;

public class SwitchEx {
	public static void main(String[] args) {
		String day = "Thursday";
		switch (day) {
			case "Monday":
				System.out.println(1);
				System.out.println(day);
				break;
			case "Tuesday":
				System.out.println(2);
				System.out.println(day);
				break;
			case "Wednesday":
				System.out.println(3);
				System.out.println(day);
				break;
			case "Thursday":
				System.out.println(4);
				System.out.println(day);
				break;
			case "Friday":
				System.out.println(5);
				System.out.println(day);
				break;
			case "Saturday":
				System.out.println(6);
				System.out.println(day);
				break;
			case "Sunday":
				System.out.println(7);
				System.out.println(day);
				break;
			default:
				System.out.println("Please enter proper day");
				break;
		}
	}
}
