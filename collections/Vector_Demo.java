package collections;

import java.util.Vector;

public class Vector_Demo {

	public static void main(String[] args) {
		
		Vector<Integer> v=new Vector<>();
			v.add(30);
			v.add(40);
		
		Vector<Integer> v1=new Vector<>();
		v1.add(10);
		v1.add(20);
		v1.addAll(v);   // here i am adding values from one vector class to another
		v1.add(10);
		
		System.out.println(v1);

	}

}
