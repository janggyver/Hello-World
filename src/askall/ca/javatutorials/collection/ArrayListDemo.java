package askall.ca.javatutorials.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arrayObj = new String[2];
		
		String[] arrayObj1 = { "c", "d"};
		
		String[] arrayObj2 = new String[]{"a", "b"};
		
		for(String str : arrayObj2){
			System.out.println(str);
		}
		System.out.println(arrayObj2.toString());
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		
		for(int i = 0; i < al.size(); i++){

			String value = al.get(i);
			System.out.println(value);

		}
		
	}

}
