package askall.ca.javatutorials.practice2;
import java.util.*;

public class stringSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Solution(123));
	}
	
	public static int Solution(int n){
		int answer = 0;
		String str = Integer.toString(n);
		for(int i=0; i < str.length(); i++){
			answer += Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return answer;
	}
}
