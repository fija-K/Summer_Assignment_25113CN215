package day30;

import java.util.Scanner;

// Mini Project using Arrays, Strings and Functions
public class StudentManagementProject{

    static Scanner sc=new Scanner(System.in);

    static int[] roll=new int[20];
    static String[] name=new String[20];
    static double[] marks=new double[20];

    static int count=0;

    // Student add karne ke liye function
    public static void addStudent(){

        if(count<20){

            System.out.print("Enter Roll Number : ");
            roll[count]=sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Student Name : ");
            name[count]=sc.nextLine();

            System.out.print("Enter Marks : ");
            marks[count]=sc.nextDouble();

            count++;

            System.out.println("Student Added Successfully.");

        }else{

            System.out.println("Record is Full.");

        }

    }

    // Students display karne ke liye function
    public static void displayStudents(){

        if(count==0){

            System.out.println("No Records Found.");

        }else{

            for(int i=0;i<count;i++){

                System.out.println("------------------------");
                System.out.println("Roll Number : "+roll[i]);
                System.out.println("Student Name : "+name[i]);
                System.out.println("Marks : "+marks[i]);

            }

        }

    }

    // Student search karne ke liye function
    public static void searchStudent(){

        System.out.print("Enter Roll Number : ");
        int search=sc.nextInt();

        boolean found=false;

        for(int i=0;i<count;i++){

            if(roll[i]==search){

                System.out.println("Student Name : "+name[i]);
                System.out.println("Marks : "+marks[i]);

                found=true;
                break;

            }

        }

        if(!found){

            System.out.println("Student Not Found.");

        }

    }

    // Average marks nikalne ke liye function
    public static void averageMarks(){

        if(count==0){

            System.out.println("No Records Found.");
            return;

        }

        double sum=0;

        for(int i=0;i<count;i++){

            sum=sum+marks[i];

        }

        System.out.println("Average Marks : "+(sum/count));

    }

    public static void main(String[] args){

        int choice;

        // Menu Driven Program
        do{

            System.out.println("\n====== STUDENT MANAGEMENT PROJECT ======");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Calculate Average");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            switch(choice){

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    averageMarks();
                    break;

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