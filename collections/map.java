package collections;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		
		Map<Integer,String> m=new HashMap<>();
		m.put(1,"veera");
		m.put(2,"Soujanya");
		m.put(3,"Sony");
		m.put(1,"veera"); // duplicate value.......
		
		for(Integer i:m.keySet()) {
			System.out.println(i+":"+m.get(i));
		}
	}

}
