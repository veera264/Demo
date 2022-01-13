package Accounts;

import java.util.Scanner;

public class Savings extends Account {
    public void saving_Account() throws Exception{
        System.out.print("Loading");
        for(int i=0;i<=6;i++) {Thread.sleep(300);System.err.print(".");}
        System.out.println();
        System.out.println("Account Type: Savings Account");
        Thread.sleep(1000);
        System.out.println("debit card details: 9992/8292/8299 , *** ");
        Thread.sleep(1000);
        System.out.println("debit card withdraw: 10000/day");
        Thread.sleep(1000);
        System.out.println("credit card money: 20000/day  , CCPoints:150 ");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("*********** Thanks Visit Again *************");
    }
    public static void main(String[] args)throws Exception {
        Savings s=new Savings();
        System.out.println("you are in saving account details...");
        Thread.sleep(3000);
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Select Account detals for 'Account'"+"\n"+"Card and other details enter 'card'");
        String input=sc.nextLine();
        if(input.equalsIgnoreCase("account")) {
            s.savings_Account_Details();
        }
        else if(input.equalsIgnoreCase("card")) {
            s.saving_Account();
        }
        else {
            System.err.println("Please enter correct input check again....");
        }
    }
}
