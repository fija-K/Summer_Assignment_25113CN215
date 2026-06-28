import java.util.*;

public class EmployeeManagement {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> employees=new HashMap<>();
        int choice;

        do{
            System.out.println("\nEmployee Management");
            System.out.println("1.Add Employee");
            System.out.println("2.View Employees");
            System.out.println("3.Remove Employee");
            System.out.println("4.Exit");

            System.out.print("Enter choice: ");
            choice=sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("enter Employee ID: ");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name=sc.nextLine();

                    employees.put(id,name);

                    System.out.println("Employee Added.");
                    break;

                case 2:

                    if(employees.isEmpty()){
                        System.out.println("No Employee Records.");
                    }
                    else{
                        for(Integer key:employees.keySet()){
                            System.out.println("ID: "+key+" Name: "+employees.get(key));
                        }
                    }





                    break;

                case 3:

                    System.out.print("Enter Employee ID: ");
                    id=sc.nextInt();

                    if(employees.remove(id)!=null){
                        System.out.println("Employee Removed.");
                    }
                    else{
                        System.out.println("Employee Not Found.");
                    }

                    break;


                case 4:
                    System.out.println("exiting...");
                    break;

                default:
                    System.out.println("invalid Choice.");
            }

        }while(choice!=4);
        sc.close();
    }
}