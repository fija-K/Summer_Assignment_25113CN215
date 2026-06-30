package day29;

import java.util.Scanner;

// Simple Inventory Management System
public class InventoryManagementSystem{

    public static void main(String[] args){

        // Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        String[] itemName=new String[20];
        int[] quantity=new int[20];

        int count=0;
        int choice;

        do{

            System.out.println("\n====== INVENTORY MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Item");
            System.out.println("2. View Items");
            System.out.println("3. Search Item");
            System.out.println("4. Update Quantity");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                // Naya item add karne ke liye
                case 1:

                    if(count<20){

                        System.out.print("Enter Item Name : ");
                        itemName[count]=sc.nextLine();

                        System.out.print("Enter Quantity : ");
                        quantity[count]=sc.nextInt();

                        count++;

                        System.out.println("Item added successfully.");

                    }else{

                        System.out.println("Inventory is Full.");

                    }

                    break;

                // Saare items dikhane ke liye
                case 2:

                    if(count==0){

                        System.out.println("No Items Found.");

                    }else{

                        System.out.println("\n------ Inventory ------");

                        for(int i=0;i<count;i++){

                            System.out.println((i+1)+". "+itemName[i]+" - Quantity : "+quantity[i]);

                        }

                    }

                    break;

                // Item search karne ke liye
                case 3:

                    System.out.print("Enter Item Name : ");
                    String search=sc.nextLine();

                    boolean found=false;

                    for(int i=0;i<count;i++){

                        if(itemName[i].equalsIgnoreCase(search)){

                            System.out.println("Item : "+itemName[i]);
                            System.out.println("Quantity : "+quantity[i]);

                            found=true;
                            break;

                        }

                    }

                    if(!found){

                        System.out.println("Item Not Found.");

                    }

                    break;

                // Quantity update karne ke liye
                case 4:

                    System.out.print("Enter Item Name : ");
                    String update=sc.nextLine();

                    boolean updated=false;

                    for(int i=0;i<count;i++){

                        if(itemName[i].equalsIgnoreCase(update)){

                            System.out.print("Enter New Quantity : ");
                            quantity[i]=sc.nextInt();

                            System.out.println("Quantity Updated.");

                            updated=true;
                            break;

                        }

                    }

                    if(!updated){

                        System.out.println("Item Not Found.");

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

        sc.close();

    }

}