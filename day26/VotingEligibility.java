import java.util.*;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        // Check eligibility
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        else{
            System.out.println("not Eligible to Vote");
        }
        sc.close();
    }
}