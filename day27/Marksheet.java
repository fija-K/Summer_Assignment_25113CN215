import java.util.*;

public class Marksheet {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name=sc.nextLine();
        int marks[]=new int[5];
        int total=0;

        for(int i=0;i<5;i++){

            System.out.print("Enter Marks of Subject "+(i+1)+": ");
            marks[i]=sc.nextInt();
            total+=marks[i];
        }
        double percentage=total/5.0;
        System.out.println("\nMarksheet");
        System.out.println("Name: "+name);
        System.out.println("Total: "+total);
        System.out.println("Percentage: "+percentage);
        if(percentage>=90)
            System.out.println("Grade: A");
        else if(percentage>=75)
            System.out.println("Grade: B");
        else if(percentage>=60)
            System.out.println("Grade: C");
        else if(percentage>=40)
            System.out.println("Grade: D");
        else
            System.out.println("Fail");

        sc.close();

    }


    
}