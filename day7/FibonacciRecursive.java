package day7;


import java.util.Scanner;
public class FibonacciRecursive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter position: ");
        int n = input.nextInt();//taking input

        int result = fibonacci(n);//calling of method and storing returned value.

        System.out.println("Fibonacci no at position " + n + " is " + result);
    }

    public static int fibonacci(int n) {
        if (n== 0) {
            return 0;
        }
        if (n ==1) {
            return 1;
        }

        // Recursive calls
        return (fibonacci(n - 1) + fibonacci(n - 2));


    }




}