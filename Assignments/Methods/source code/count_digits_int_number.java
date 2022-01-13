package Task6;

import java.util.Arrays;

public class count_digits_int_number {
	
	static void count(int i) {
		int count=0;
		int k=i;
		while(i!=0)
		{
			count++;
			i=i/10;
		}
		
		int a[]=new int[count];
		for(int j=0;j<count;j++) {
			int h=k%10;
			a[j]=h;
			k/=10;
		}
		Arrays.sort(a);
		int temp=1;
		for(int m=0;m<a.length;m++) {
			for(int n=m+1;n<a.length;n++) {
				if(a[m]==a[n]) {
					temp++;
					m++;
				}
			}
			System.out.println(a[m]+" is repeting in: "+temp);
			temp=1;
		}
	}
	public static void main(String[] args) {
		count(112233245);

	}

}
