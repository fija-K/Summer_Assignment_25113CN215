package day28;

import java.util.Scanner;

// Simple Contact Management System
public class ContactManagementSystem{

    public static void main(String[] args){

        // Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        String[] names=new String[20];
        String[] numbers=new String[20];

        int count=0;
        int choice;

        // Menu tab tak chalega jab tak user exit na kare
        do{

            System.out.println("\n====== CONTACT MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                // Naya contact add karne ke liye
                case 1:

                    if(count<20){

                        System.out.print("Enter Name : ");
                        names[count]=sc.nextLine();

                        System.out.print("Enter Mobile Number : ");
                        numbers[count]=sc.nextLine();

                        count++;

                        System.out.println("Contact added successfully.");

                    }else{

                        System.out.println("Contact list is full.");

                    }

                    break;

                // Saare contacts dikhane ke liye
                case 2:

                    if(count==0){

                        System.out.println("No contacts found.");

                    }else{

                        System.out.println("\n----- Contact List -----");

                        for(int i=0;i<count;i++){

                            System.out.println((i+1)+". "+names[i]+" - "+numbers[i]);

                        }

                    }

                    break;

                // Naam se contact search karne ke liye
                case 3:

                    System.out.print("Enter Name to Search : ");
                    String search=sc.nextLine();

                    boolean found=false;

                    for(int i=0;i<count;i++){

                        if(names[i].equalsIgnoreCase(search)){

                            System.out.println("Name : "+names[i]);
                            System.out.println("Mobile Number : "+numbers[i]);

                            found=true;
                            break;

                        }

                    }

                    if(!found){

                        System.out.println("Contact not found.");

                    }

                    break;

                // Contact delete karne ke liye
                case 4:

                    System.out.print("Enter Name to Delete : ");
                    String delete=sc.nextLine();

                    boolean deleted=false;

                    for(int i=0;i<count;i++){

                        if(names[i].equalsIgnoreCase(delete)){

                            // Delete ke baad remaining contacts ko shift karenge
                            for(int j=i;j<count-1;j++){

                                names[j]=names[j+1];
                                numbers[j]=numbers[j+1];

                            }

                            count--;

                            deleted=true;

                            System.out.println("Contact deleted successfully.");

                            break;

                        }

                    }

                    if(!deleted){

                        System.out.println("Contact not found.");

                    }

                    break;

                // Program band karne ke liye
                case 5:

                    System.out.println("Thank You!");
                    break;

                // Agar galat option enter ho
                default:

                    System.out.println("Invalid Choice.");

            }

        }while(choice!=5);

        // Scanner close kar diya
        sc.close();

    }

}
