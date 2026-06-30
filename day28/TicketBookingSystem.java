package day28;

import java.util.Scanner;

// Simple Ticket Booking System
public class TicketBookingSystem{

    public static void main(String[] args){

        // Scanner input ke liye
        Scanner sc=new Scanner(System.in);

        int totalTickets=50;
        int bookedTickets=0;
        int choice;
        int tickets;

        // Menu tab tak chalega jab tak user exit na kare
        do{

            System.out.println("\n====== TICKET BOOKING SYSTEM ======");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Available Tickets");
            System.out.println("4. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            switch(choice){

                // Ticket book karne ke liye
                case 1:

                    System.out.print("Enter number of tickets : ");
                    tickets=sc.nextInt();

                    if(tickets<=0){
                        System.out.println("Invalid number of tickets.");
                    }else if(tickets<=(totalTickets-bookedTickets)){
                        bookedTickets=bookedTickets+tickets;
                        System.out.println("Ticket booked successfully.");
                    }else{
                        System.out.println("Not enough tickets available.");
                    }

                    break;

                // Ticket cancel karne ke liye
                case 2:

                    System.out.print("Enter number of tickets to cancel : ");
                    tickets=sc.nextInt();

                    if(tickets<=0){
                        System.out.println("Invalid number of tickets.");
                    }else if(tickets<=bookedTickets){
                        bookedTickets=bookedTickets-tickets;
                        System.out.println("Ticket cancelled successfully.");
                    }else{
                        System.out.println("You have not booked that many tickets.");
                    }

                    break;

                // Available tickets dikhane ke liye
                case 3:

                    System.out.println("Total Tickets : "+totalTickets);
                    System.out.println("Booked Tickets : "+bookedTickets);
                    System.out.println("Available Tickets : "+(totalTickets-bookedTickets));

                    break;

                // Program band karne ke liye
                case 4:

                    System.out.println("Thank You!");
                    break;

                // Agar galat option enter ho
                default:

                    System.out.println("Invalid Choice.");

            }

        }while(choice!=4);

        // Scanner close kar diya
        sc.close();

    }

}