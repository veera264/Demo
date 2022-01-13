package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collections_class {

	public static void main(String[] args) {
	
		// in collections is a class  from utility class in java and all methods in it is a static methods
		
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(51);
		Collections.shuffle(list);
		System.out.println("this will shuffule  the values:"+list);
		Collections.sort(list);
		System.out.println("SOrt of all values:"+list);
		int i=Collections.binarySearch(list,4);
		System.out.println("This find value using binary search :"+i);
		System.out.println("This will make list empty:");
		System.out.println(Collections.emptyList());
		int j=Collections.max(list); 
		System.out.println("Maximum value in list: "+j);
		int j1=Collections.min(list); 
		System.out.println("Minimum value in list: "+j1);
		Collections.reverse(list);
		System.out.println("Reverse of list: "+list);
		Collections.synchronizedList(list); // this will make list has synchronized 
		

		
	}

}
