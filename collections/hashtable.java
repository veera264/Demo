package collections;

import java.util.Hashtable;
import java.util.Map;

public class hashtable {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new Hashtable<>();
		m.put(1,"Veera");
		m.put(2,"Soujanya");
		m.put(3,"Sony");
		m.put(1,"Mani");  // this will replace value 
		m.remove(1);    // this remove value based on key we passed
		System.out.println("value is:"+m.containsValue("Sony"));  // if value is present than it will return true
		for(Integer l:m.keySet()) {
			System.out.println(m.get(l));
		}
		
		
	}

}
