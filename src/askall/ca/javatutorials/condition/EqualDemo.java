package askall.ca.javatutorials.condition;

public class EqualDemo {

	public static void main(String[] args) {
		String a = "Hello World";
		String b = new String("Hello World");
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}
