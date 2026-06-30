package day29;

import java.util.Scanner;

// Simple Menu Driven Array Operations
public class MenuDrivenArrayOperations{

    public static void main(String[] args){

        // Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[100];
        int n;
        int choice;

        // Array ka size lena
        System.out.print("Enter number of elements : ");
        n=sc.nextInt();

        // Array ke elements input lena
        System.out.println("Enter array elements :");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        // Menu tab tak chalega jab tak user exit na kare
        do{

            System.out.println("\n====== MENU DRIVEN ARRAY OPERATIONS ======");
            System.out.println("1. Display Array");
            System.out.println("2. Search Element");
            System.out.println("3. Find Maximum");
            System.out.println("4. Find Minimum");
            System.out.println("5. Find Sum");
            System.out.println("6. Find Average");
            System.out.println("7. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            switch(choice){

                // Array display karne ke liye
                case 1:

                    System.out.print("Array Elements : ");

                    for(int i=0;i<n;i++){
                        System.out.print(arr[i]+" ");
                    }

                    System.out.println();
                    break;

                // Element search karne ke liye
                case 2:

                    System.out.print("Enter element to search : ");
                    int key=sc.nextInt();

                    boolean found=false;

                    for(int i=0;i<n;i++){

                        if(arr[i]==key){

                            System.out.println("Element found at position "+(i+1));
                            found=true;
                            break;

                        }

                    }

                    if(!found){
                        System.out.println("Element not found.");
                    }

                    break;

                // Maximum element nikalne ke liye
                case 3:

                    int max=arr[0];

                    for(int i=1;i<n;i++){

                        if(arr[i]>max){
                            max=arr[i];
                        }

                    }

                    System.out.println("Maximum Element : "+max);

                    break;

                // Minimum element nikalne ke liye
                case 4:

                    int min=arr[0];

                    for(int i=1;i<n;i++){

                        if(arr[i]<min){
                            min=arr[i];
                        }

                    }

                    System.out.println("Minimum Element : "+min);

                    break;

                // Sum nikalne ke liye
                case 5:

                    int sum=0;

                    for(int i=0;i<n;i++){
                        sum=sum+arr[i];
                    }

                    System.out.println("Sum of Elements : "+sum);

                    break;

                // Average nikalne ke liye
                case 6:

                    int total=0;

                    for(int i=0;i<n;i++){
                        total=total+arr[i];
                    }

                    double average=(double)total/n;

                    System.out.println("Average : "+average);

                    break;

                // Program band karne ke liye
                case 7:

                    System.out.println("Thank You!");
                    break;

                // Agar galat choice ho
                default:

                    System.out.println("Invalid Choice.");

            }

        }while(choice!=7);

        // Scanner close kar diya
        sc.close();

    }

}