import java.util.*;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        ArrayList<String> students=new ArrayList<>();

        int choice;

        do{

            System.out.println("\nStudent Management");
            System.out.println("1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Remove Student");
            System.out.println("4.Exit");
            System.out.print("enter choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter student name: ");
                    students.add(sc.nextLine());
                    System.out.println("Student Added.");
                    break;
                case 2:
                    System.out.println("\nStudent Records:");
                    if(students.size()==0){
                        System.out.println("No Records Found.");
                    }
                    else{
                        for(int i=0;i<students.size();i++){
                            System.out.println((i+1)+". "+students.get(i));
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter student name to remove: ");
                    String name=sc.nextLine();

                    if(students.remove(name)){
                        System.out.println("Student Removed.");
                    }
                    else{
                        System.out.println("Student Not Found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        }while(choice!=4);
        sc.close();
    }
}