package day28;

import java.util.Scanner;

// Simple Bank Account System
public class BankAccountSystem{

    public static void main(String[] args){

        //Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        String name;
        int accountNumber;
        double balance=0;
        int choice;
        double amount;

        // User se account details lena
        System.out.print("Enter Account Holder Name : ");
        name=sc.nextLine();

        System.out.print("Enter Account Number : ");


        accountNumber=sc.nextInt();

        // Jab tak user exit na kare menu chalta rahega
        do{

            System.out.println("\n====== BANK ACCOUNT SYSTEM ======");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            switch(choice){

                // Deposit karne ke liye
                case 1:

                

                    System.out.print("Enter amount to deposit : ");
                    amount=sc.nextDouble();

                    if(amount>0){
                        balance=balance+amount;
                        System.out.println("Amount deposited successfully.");
                    }else{
                        System.out.println("Invalid amount.");
                    }

                    break;

                // Withdraw karne ke liye
                case 2:

                    System.out.print("Enter amount to withdraw : ");
                    amount=sc.nextDouble();

                    if(amount<=balance){
                        balance=balance-amount;
                        System.out.println("Amount withdrawn successfully.");
                    }else{
                        System.out.println("Insufficient Balance.");
                    }

                    break;

                // Balance check karne ke liye
                case 3:

                    System.out.println("Current Balance : "+balance);

                    break;

                // Account details dikhane ke liye
                case 4:

                    System.out.println("\n----- Account Details -----");
                    System.out.println("Account Holder : "+name);
                    System.out.println("Account Number : "+accountNumber);
                    System.out.println("Balance : "+balance);

                    break;

                // Program band karne ke liye
                case 5:

                    System.out.println("Thank You!");
                    break;

                // Agar galat choice enter ho
                default:

                    System.out.println("Invalid Choice.");

            }

        }while(choice!=5);

        // Scanner close kar diya
        sc.close();

    }

}