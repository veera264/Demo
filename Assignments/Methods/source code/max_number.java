package Task6;

public class max_number {
	
	static void max(int array[]) {
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
		System.out.println("2nd max number:"+array[array.length-2]);}
	public static void main(String[] args) {
		
		int arr[]= {1,2,321,1,33,4};
		max(arr);
	}

}
