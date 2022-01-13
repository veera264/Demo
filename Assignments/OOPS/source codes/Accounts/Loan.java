package Accounts;

import java.util.Scanner;

public class Loan extends Account{
    public void loan_Details() throws Exception{
        System.out.print("Loading");
        for(int i=0;i<=6;i++) {Thread.sleep(300);System.err.print(".");}
        System.out.println();
        System.out.println("Account Type: loan Account...");
        Thread.sleep(1000);
        System.out.println("Loan amount: 2000000/-");
        Thread.sleep(1000);
        System.out.println("Monthly Emi: 20000");
        Thread.sleep(1000);
        System.out.println("Intrest amount: 10000/-");
        Thread.sleep(1000);
        System.out.println();
        System.out.println("*********** Thanks Visit Again *************");
    }
    public static void main(String[] args) throws Exception {
        Loan l=new Loan();
        System.out.println("you are in loan account details...");
        Thread.sleep(3000);
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Select Account detals for 'Account'"+"\n"+" For loan details enter 'loan'");
        String input=sc.nextLine();
        if(input.equalsIgnoreCase("account")) {
            l.loan_Account_Details();   }
        else if(input.equalsIgnoreCase("loan")) {
            l.loan_Details();
        }   else
        {
        System.err.println("Please enter correct input check again....");
        }
    }
}

