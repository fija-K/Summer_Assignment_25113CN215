package day29;

import java.util.Scanner;

// Simple Menu Driven String Operations
public class MenuDrivenStringOperations{

    public static void main(String[] args){

        // Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        String str;
        int choice;

        // User se string lena
        System.out.print("Enter a String : ");
        str=sc.nextLine();

        do{

            System.out.println("\n====== STRING OPERATIONS ======");
            System.out.println("1. Display String");
            System.out.println("2. Find Length");
            System.out.println("3. Convert to Uppercase");
            System.out.println("4. Convert to Lowercase");
            System.out.println("5. Reverse String");
            System.out.println("6. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            switch(choice){

                // String print karne ke liye
                case 1:

                    System.out.println("String : "+str);
                    break;

                // Length nikalne ke liye
                case 2:

                    System.out.println("Length : "+str.length());
                    break;

                // Uppercase me convert
                case 3:

                    System.out.println("Uppercase : "+str.toUpperCase());
                    break;

                // Lowercase me convert
                case 4:

                    System.out.println("Lowercase : "+str.toLowerCase());
                    break;

                // Reverse string
                case 5:

                    String reverse="";

                    for(int i=str.length()-1;i>=0;i--){
                        reverse=reverse+str.charAt(i);
                    }

                    System.out.println("Reversed String : "+reverse);
                    break;

                // Exit
                case 6:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        }while(choice!=6);

        sc.close();

    }

}