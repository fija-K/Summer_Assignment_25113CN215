package day11;


import java.util.Scanner;
//Write a program to Find factorial of a number.
//same as q 3rd day1
public class factorial_function {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n = input.nextInt();
        Factorial(n);//method calling
        input.close();


    }
    //method
    static void Factorial(int a){
        int fact=1;
        for (int i=1;i<=a;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+a+" is:"+fact);
    }
}