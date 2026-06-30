package day29;

import java.util.Scanner;

// Simple Menu Driven Calculator
public class MenuDrivenCalculator{

    public static void main(String[] args){

        // Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        double num1;
        double num2;
        int choice;

        // Menu tab tak chalega jab tak user exit na kare
        do{

            System.out.println("\n====== MENU DRIVEN CALCULATOR ======");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("6. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            switch(choice){

                // Addition
                case 1:

                    System.out.print("Enter First Number : ");
                    num1=sc.nextDouble();

                    System.out.print("Enter Second Number : ");
                    num2=sc.nextDouble();

                    System.out.println("Result : "+(num1+num2));
                    break;

                // Subtraction
                case 2:

                    System.out.print("Enter First Number : ");
                    num1=sc.nextDouble();

                    System.out.print("Enter Second Number : ");
                    num2=sc.nextDouble();

                    System.out.println("Result : "+(num1-num2));
                    break;

                // Multiplication
                case 3:

                    System.out.print("Enter First Number : ");
                    num1=sc.nextDouble();

                    System.out.print("Enter Second Number : ");
                    num2=sc.nextDouble();

                    System.out.println("Result : "+(num1*num2));
                    break;

                // Division
                case 4:

                    System.out.print("Enter First Number : ");
                    num1=sc.nextDouble();

                    System.out.print("Enter Second Number : ");
                    num2=sc.nextDouble();

                    if(num2!=0){
                        System.out.println("Result : "+(num1/num2));
                    }else{
                        System.out.println("Division by zero is not possible.");
                    }

                    break;

                // Modulus
                case 5:

                    System.out.print("Enter First Number : ");
                    num1=sc.nextDouble();

                    System.out.print("Enter Second Number : ");
                    num2=sc.nextDouble();

                    if(num2!=0){
                        System.out.println("Result : "+(num1%num2));
                    }else{
                        System.out.println("Modulus by zero is not possible.");
                    }

                    break;

                // Exit
                case 6:

                    System.out.println("Thank You!");
                    break;

                // Agar galat choice ho
                default:

                    System.out.println("Invalid Choice.");

            }

        }while(choice!=6);

        // Scanner close kar diya
        sc.close();

    }

}