package Summer_Assignment_25113CN215.day1;

import java.util.Scanner;
//Write a program to Find factorial of a number.
public class q3 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n = input.nextInt();
        Factorial(n);
        input.close();


    }
    static void Factorial(int a){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+a+" is:"+fact);
    }
}