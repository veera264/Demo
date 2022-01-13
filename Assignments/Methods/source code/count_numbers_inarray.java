package Task6;

import java.util.Arrays;

public class count_numbers_inarray {
	
	static void count(int arr[]) {
		Arrays.sort(arr);
		int count=1;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					count++;
					i++;
					}
			}
			System.out.println(arr[i]+" is repeting in:  "+count);
			count=1;
		 }
	}
	public static void main(String[] args) {
		
		int arr1[]= {1,2,10,3,4,3,2,10,2};
		count(arr1);

	}

}
