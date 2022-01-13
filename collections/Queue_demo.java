package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_demo {

	public static void main(String[] args) {
		
		Queue<Integer> q=new PriorityQueue<>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		System.out.println(q);
		
		q.poll();  // this will remove the first value what we pass there it is 1.
		
		System.out.println(q);
	}

}
