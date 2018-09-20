package askall.ca.javatutorials.datatype;

public class IntDatatypeDemo {

	public static void main(String[] args) {
		String a = "Hello world";
		String c = "Hello World";
        String b = new String("Hello world");
        System.out.println(a.toString() == b.toString());
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.toString() == b.toString());
        System.out.println(a.toString() == c.toString());
        System.out.println(a.equals(b));

	}

}
