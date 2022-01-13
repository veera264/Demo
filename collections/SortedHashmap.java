package collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedHashmap {

	public static void main(String[] args) {
		
		SortedMap<Integer,String> sm=new TreeMap<>();
		sm.put(1,"Veera");
		sm.put(2,"Soujanya");
		sm.put(3,"Sony");
		sm.put(1,"Mani"); 
		sm.clear();
		System.out.println(sm);

	}

}
