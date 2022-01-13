package collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Demo {

	public static void main(String[] args) {

		Set<Integer> set=new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(null);  // duplicate value
		System.out.println(set);
	}

}
