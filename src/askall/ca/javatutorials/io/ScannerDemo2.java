package askall.ca.javatutorials.io;
import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int i = sc.nextInt();
			System.out.println(i*2000);
		}
		sc.close();
	}

}
