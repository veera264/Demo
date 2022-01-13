package Task5;

import java.util.Arrays;

public class Count_numbers_in_array {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,10,3,4,3,2,10,2};
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
	}
