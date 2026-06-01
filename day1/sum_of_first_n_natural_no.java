package Summer_Assignment_25113CN215.day1;
import java.util.Scanner;
//Write a program to Calculate sum of first N natural numbers.
public class sum_of_first_n_natural_no {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n = input.nextInt();
        sum_of_first_natural_numbers(n);
        input.close();


    }
    static void sum_of_first_natural_numbers(int a){
        int sum=0;
    
        for (int i=1;i<=a;i++){
            sum+=i;

        }
        System.out.println("sum: "+sum);

    }
}
