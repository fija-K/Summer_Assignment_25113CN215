package day7;

import java.util.Scanner;

public class FactorialRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter no: ");
        int num = input.nextInt();//taking input

        long result = factorial(num);//calling of method and storing returned value.

        System.out.println("Factorial of " + num + " is " + result);
    }

    public static long factorial(int n) {
        if (n==0||n ==1) {
            return 1;
        }

        // Recursive call
        return (n*(factorial(n-1)));


    }



}
