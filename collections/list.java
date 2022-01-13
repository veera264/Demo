package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class list {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(1);
		
		ListIterator<Integer> l = list1.listIterator();
		
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println();
		
		for(Integer h:list1) {
			System.out.println(h);
		}
		System.out.println();
		
		Iterator<Integer> itr=list1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		List<Integer> list2=new ArrayList<Integer>();
		list2.add(5);
		list2.add(6);
		
		list1.addAll(list2);
		//list1.retainAll(list2);
		//list1.clear();
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		System.out.println(list1.contains(1));
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println();
		
		
	}

}
