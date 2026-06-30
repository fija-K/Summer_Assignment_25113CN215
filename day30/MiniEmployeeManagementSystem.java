package day30;

import java.util.Scanner;

// Simple Mini Employee Management System
public class MiniEmployeeManagementSystem{

    public static void main(String[] args){

        // Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        int[] empId=new int[20];
        String[] empName=new String[20];
        double[] salary=new double[20];

        int count=0;
        int choice;

        // Menu tab tak chalega jab tak user exit na kare
        do{

            System.out.println("\n====== EMPLOYEE MANAGEMENT SYSTEM ======");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Salary");
            System.out.println("5. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice){

                // Employee add karne ke liye
                case 1:

                    if(count<20){

                        System.out.print("Enter Employee ID : ");
                        empId[count]=sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Employee Name : ");
                        empName[count]=sc.nextLine();

                        System.out.print("Enter Salary : ");
                        salary[count]=sc.nextDouble();

                        count++;

                        System.out.println("Employee Added Successfully.");

                    }else{

                        System.out.println("Employee List is Full.");

                    }

                    break;

                // Employees display karne ke liye
                case 2:

                    if(count==0){

                        System.out.println("No Employee Records.");

                    }else{

                        System.out.println("\n------ Employee Details ------");

                        for(int i=0;i<count;i++){

                            System.out.println("Employee ID : "+empId[i]);
                            System.out.println("Employee Name : "+empName[i]);
                            System.out.println("Salary : "+salary[i]);
                            System.out.println("------------------------------");

                        }

                    }

                    break;

                // Employee search karne ke liye
                case 3:

                    System.out.print("Enter Employee ID : ");
                    int search=sc.nextInt();

                    boolean found=false;

                    for(int i=0;i<count;i++){

                        if(empId[i]==search){

                            System.out.println("Employee Name : "+empName[i]);
                            System.out.println("Salary : "+salary[i]);

                            found=true;
                            break;

                        }

                    }

                    if(!found){

                        System.out.println("Employee Not Found.");

                    }

                    break;

                // Salary update karne ke liye
                case 4:

                    System.out.print("Enter Employee ID : ");
                    int update=sc.nextInt();

                    boolean updated=false;

                    for(int i=0;i<count;i++){

                        if(empId[i]==update){

                            System.out.print("Enter New Salary : ");
                            salary[i]=sc.nextDouble();

                            System.out.println("Salary Updated Successfully.");

                            updated=true;
                            break;

                        }

                    }

                    if(!updated){

                        System.out.println("Employee Not Found.");

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