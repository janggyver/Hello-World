package askall.ca.javatutorials.collection;
import java.util.HashMap;
import java.util.*;
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> a = new HashMap<String, Integer>();
		
		a.put("one", 1);
		a.put("two", 2);
		a.put("three", 3);
		a.put("four", 2);
		
		System.out.println(a.get("one"));
		System.out.println(a.get("two"));
		System.out.println(a.get("three"));
		
		iterateUsingForEach(a);
		iterateUsingIterator(a);
		

	}
	
	static void iterateUsingForEach(HashMap map){
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries ){
			System.out.println("key : " + entry.getKey() + " and " + "value: " + entry.getValue());
		}
	}
	
	static void iterateUsingIterator(HashMap map){
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = entries.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
			System.out.println("key : " + entry.getKey() + " and " + "value: " + entry.getValue());
		}
		
	}
	

}
