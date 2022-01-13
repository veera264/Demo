package ATM;

import java.util.Scanner;

public class Moneywithdraw {
	
	static double amount=10000;
	static double da;
	public static void main(String[] args)throws InterruptedException {
			
		Scanner sc=new Scanner(System.in);	
		try {
			System.out.println("Balance press 1");
			System.out.println("Withdraw press 2");
			System.out.println("Deposit Money press 3");
			int option=sc.nextInt();
			if(option==2) {
				System.out.println("Enter amount to withdraw..");
				da=sc.nextInt();
			 if(amount-da>=5000){
				System.out.println("validating cash");
				for(int i=0;i<=5;i++) {
					Thread.sleep(700);
					System.err.print(".");
				}System.out.println();
				System.out.println("please collect u r cash...");
				Thread.sleep(3000);
				da=amount-da;
				check();
				
			 
			}else{
				 throw new expHandling("Amount in u r account "+amount+" minimum balance in u r account is 5000 \n please select amount lessthan 5000");
			}}
			else if(option==1) {
				System.out.println("Balance :"+amount);
			}else if(option==3){
				System.out.println("Please enter amount to deposit..");
				 da=sc.nextDouble();
				System.out.println(da+" Deposit in your account...");
				da=amount+da;
				Thread.sleep(3000);
				check();
			}else {
				throw new expHandling("Please Enter correct option");
			}
			
		}catch (expHandling e) {System.out.println(e.getMessage());
		}

	}	public static void check() {
		System.out.println("show Balance....");
		Scanner sc1=new Scanner(System.in);
		System.out.println("yes , no");
		String bal=sc1.nextLine();
		if(bal.equalsIgnoreCase("yes")) {
			System.out.println("Balance :"+ da);}
		else {System.out.println("Thanks for using Your Atm good day for you");}
	}

}
