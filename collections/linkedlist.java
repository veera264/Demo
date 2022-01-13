package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class linkedlist {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(1,3);
		
		ListIterator<Integer> l = ll.listIterator();
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		System.out.println();
		
		for(Integer j:ll) {
			System.out.println(j);
		}
		System.out.println();
		
		for(int l1=0;l1<ll.size();l1++) {
			System.out.println(ll.get(l1));
		}
		System.out.println();
		
		Iterator<Integer> l2=ll.iterator();
		while(l2.hasNext()) {
			System.out.println(l2.next());
		}

	}

}
