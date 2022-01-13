package Task5;

public class Max_Numbers {

	public static void main(String[] args) {
		
		int array[]= {1,5,3,7,8,2};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				int temp=0;
				if(array[j]< array[i]) {
					 temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("1st max number:"+array[array.length-1]);
		System.out.println("2nd max number:"+array[array.length-2]);
	}

}
