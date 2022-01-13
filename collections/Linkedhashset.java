package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

	public static void main(String[] args) {
	
		Set<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(1);
		set.add(8);
		set.add(5);
		set.add(10);   
		set.add(1);
		set.add(8);
		set.add(5);     
		//set.remove(1);  this will remove the value that we passed..
		System.out.println(set);
	}

}
