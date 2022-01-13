package Task6;

public class leep_year {
	
	static void year(int year) {
		if(((year%4==0)&&(year%100!=0))||(year%400==0)) {System.out.println(year+" is a leep year");}
		else {System.out.println(year+" is not a leep year");}
	}
	public static void main(String[] args) {
		year(2021);
		
	}

}
