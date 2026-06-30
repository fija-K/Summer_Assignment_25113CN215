package day28;

import java.util.ArrayList;
import java.util.Scanner;

// Book class banayi hai jisme har book ki details store hongi
class Book{

    // Book ki basic details
    int id;
    String title;
    String author;
    boolean issued;

    // Constructor se book object initialize hoga
    Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
        this.issued=false;
    }

    // Book ki details print karne ke liye method
    void displayBook(){

        System.out.println("--------------------------------------");
        System.out.println("Book ID : "+id);
        System.out.println("Title   : "+title);
        System.out.println("Author  : "+author);

        // Check karenge book issue hai ya available
        if(issued){
            System.out.println("Status  : Issued");
        }else{
            System.out.println("Status  : Available");
        }
    }
}

public class LibraryManagementSystem{

    public static void main(String[] args){

        // Scanner object input lene ke liye
        Scanner sc=new Scanner(System.in);

        // Saari books ko store karne ke liye ArrayList
        ArrayList<Book> books=new ArrayList<>();

        int choice;

        // Jab tak user Exit nahi karta tab tak menu chalta rahega
        do{

            System.out.println("\n========== LIBRARY MANAGEMENT SYSTEM ==========");
            System.out.println("1. Add Book");
            System.out.println("2. Display All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");

            System.out.print("Enter your choice : ");
            choice=sc.nextInt();

            switch(choice){

                // Nayi book add karne ke liye
                case 1:

                    System.out.print("Enter Book ID : ");
                    int id=sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Book Title : ");
                    String title=sc.nextLine();

                    System.out.print("Enter Author Name : ");
                    String author=sc.nextLine();

                    books.add(new Book(id,title,author));

                    System.out.println("Book added successfully.");
                    break;

                // Library ki saari books dikhane ke liye
                case 2:

                    if(books.isEmpty()){
                        System.out.println("Library is empty.");
                    }else{

                        System.out.println("\nBooks in Library:");

                        for(Book book:books){
                            book.displayBook();
                        }

                    }

                    break;

                // ID se book search karne ke liye
                case 3:

                    System.out.print("Enter Book ID to Search : ");
                    int searchId=sc.nextInt();

                    Book searchBook=findBook(books,searchId);

                    if(searchBook!=null){
                        System.out.println("\nBook Found");
                        searchBook.displayBook();
                    }else{
                        System.out.println("Book not found.");
                    }

                    break;

                // Book issue karne ke liye
                case 4:

                    System.out.print("Enter Book ID to Issue : ");
                    int issueId=sc.nextInt();

                    Book issueBook=findBook(books,issueId);

                    if(issueBook!=null){

                        if(issueBook.issued){
                            System.out.println("Book is already issued.");
                        }else{
                            issueBook.issued=true;
                            System.out.println("Book issued successfully.");
                        }

                    }else{
                        System.out.println("Book not found.");
                    }

                    break;

                // Book return karne ke liye
                case 5:

                    System.out.print("Enter Book ID to Return : ");
                    int returnId=sc.nextInt();

                    Book returnBook=findBook(books,returnId);

                    if(returnBook!=null){

                        if(returnBook.issued){
                            returnBook.issued=false;
                            System.out.println("Book returned successfully.");
                        }else{
                            System.out.println("Book is already available.");
                        }

                    }else{
                        System.out.println("Book not found.");
                    }

                    break;

                // Library se book delete karne ke liye
                case 6:

                    System.out.print("Enter Book ID to Remove : ");
                    int removeId=sc.nextInt();

                    Book removeBook=findBook(books,removeId);

                    if(removeBook!=null){

                        books.remove(removeBook);
                        System.out.println("Book removed successfully.");

                    }else{

                        System.out.println("Book not found.");

                    }

                    break;

                // Program band karne ke liye
                case 7:

                    System.out.println("Thank you for using Library Management System.");
                    break;

                // Agar galat option enter ho
                default:

                    System.out.println("Invalid choice.");
            }

        }while(choice!=7);

        // Scanner close kar diya
        sc.close();
    }

    // Ye method ID ke basis pe book search karega
    public static Book findBook(ArrayList<Book> books,int id){

        // ArrayList me ek-ek book check karenge
        for(Book book:books){

            if(book.id==id){
                return book;
            }

        }

        // Agar book nahi mili to null return hoga
        return null;
    }
}
