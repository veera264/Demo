package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {

	public static void main(String[] args) {
		
		SortedSet<Integer> ss=new TreeSet<>();
		ss.add(10);
		ss.add(1);
		ss.add(8);
		ss.add(5);
		ss.add(10);   
		ss.add(1);
		ss.add(8);
		ss.add(5); 
		// ss.add(null);    sorted set don't allow null values
		System.out.println(ss);
	}

}
