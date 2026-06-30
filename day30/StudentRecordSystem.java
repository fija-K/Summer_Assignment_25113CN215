package day30;

import java.util.Scanner;

// Simple Student Record System
public class StudentRecordSystem{

    public static void main(String[] args){

        // Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        String[] name=new String[20];
        int[] rollNo=new int[20];
        double[] marks=new double[20];

        int count=0;
        int choice;

        // Menu tab tak chalega jab tak user exit na kare
        do{

            System.out.println("\n====== STUDENT RECORD SYSTEM ======");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                // Student add karne ke liye
                case 1:

                    if(count<20){

                        System.out.print("Enter Roll Number : ");
                        rollNo[count]=sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Student Name : ");
                        name[count]=sc.nextLine();

                        System.out.print("Enter Marks : ");
                        marks[count]=sc.nextDouble();

                        count++;

                        System.out.println("Student Record Added.");

                    }else{

                        System.out.println("Record is Full.");

                    }

                    break;

                // Saare students dikhane ke liye
                case 2:

                    if(count==0){

                        System.out.println("No Records Found.");

                    }else{

                        System.out.println("\n------ Student Records ------");

                        for(int i=0;i<count;i++){

                            System.out.println("Roll No : "+rollNo[i]);
                            System.out.println("Name : "+name[i]);
                            System.out.println("Marks : "+marks[i]);
                            System.out.println("----------------------------");

                        }

                    }

                    break;

                // Roll Number se search
                case 3:

                    System.out.print("Enter Roll Number : ");
                    int search=sc.nextInt();

                    boolean found=false;

                    for(int i=0;i<count;i++){

                        if(rollNo[i]==search){

                            System.out.println("Name : "+name[i]);
                            System.out.println("Marks : "+marks[i]);

                            found=true;
                            break;

                        }

                    }

                    if(!found){

                        System.out.println("Student Not Found.");

                    }

                    break;

                // Exit
                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }

        }while(choice!=4);

        // Scanner close
        sc.close();

    }

}