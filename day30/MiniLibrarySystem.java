package day30;

import java.util.Scanner;

// Simple Mini Library System
public class MiniLibrarySystem{

    public static void main(String[] args){

        // Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        String[] books=new String[20];
        boolean[] issued=new boolean[20];

        int count=0;
        int choice;

        do{

            System.out.println("\n====== MINI LIBRARY SYSTEM ======");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                // Book add karne ke liye
                case 1:

                    if(count<20){

                        System.out.print("Enter Book Name : ");
                        books[count]=sc.nextLine();

                        issued[count]=false;

                        count++;

                        System.out.println("Book Added Successfully.");

                    }else{

                        System.out.println("Library is Full.");

                    }

                    break;

                // Books display karne ke liye
                case 2:

                    if(count==0){

                        System.out.println("No Books Available.");

                    }else{

                        for(int i=0;i<count;i++){

                            System.out.print((i+1)+". "+books[i]);

                            if(issued[i]){
                                System.out.println(" (Issued)");
                            }else{
                                System.out.println(" (Available)");
                            }

                        }

                    }

                    break;

                // Book issue karne ke liye
                case 3:

                    System.out.print("Enter Book Number : ");
                    int issue=sc.nextInt();

                    if(issue>=1&&issue<=count){

                        if(!issued[issue-1]){

                            issued[issue-1]=true;
                            System.out.println("Book Issued.");

                        }else{

                            System.out.println("Book Already Issued.");

                        }

                    }else{

                        System.out.println("Invalid Book Number.");

                    }

                    break;

                // Book return karne ke liye
                case 4:

                    System.out.print("Enter Book Number : ");
                    int ret=sc.nextInt();

                    if(ret>=1&&ret<=count){

                        if(issued[ret-1]){

                            issued[ret-1]=false;
                            System.out.println("Book Returned.");

                        }else{

                            System.out.println("Book Already Available.");

                        }

                    }else{

                        System.out.println("Invalid Book Number.");

                    }

                    break;

                // Exit
                case 5:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        }while(choice!=5);

        // Scanner close
        sc.close();

    }

}