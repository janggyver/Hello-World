package askall.ca.javatutorials.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class ListSetDemo {

	public static void main(String[] agrs){
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		System.out.println("ArrayList");
		Iterator<String> ai = (Iterator<String>)al.iterator();
		while(ai.hasNext()){
			System.out.println(ai.next());
		}
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("one");
		hs.add("two");
		hs.add("two");
		hs.add("two");
		hs.add("three");
		
		Iterator<String> hi = (Iterator<String>)hs.iterator();
		while(hi.hasNext()){
			System.out.println(hi.next());
		}
		
		
	}
}
