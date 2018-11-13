package askall.ca.javatutorials.practice2;

import java.util.Arrays;

public class ArraySortLike {

	static String[] arr = new String[] {"a1", "a2", "a3",
			"a4", "b1", "b2", "b3", "b4"};
	static String[] result = new String[arr.length];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sortAlphabet();
		
	}

	public static void sortAlphabet(){

		for(int i = 1; i < (arr.length /2)+1; i++){
			result[2*i-2] = arr[i-1];
			result[2*i-1] = arr[i+(arr.length/2)-1];
		}
		System.out.println(Arrays.toString(result));
	}
}
