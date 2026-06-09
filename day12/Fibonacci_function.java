package day12;

import java.util.Scanner;
//Write a program to Generate Fibonacci series.//same as question 13 day4
public class Fibonacci_function{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n(n should be a natural no.");
        int n= input.nextInt();
        Fibonacci(n);//method calling
        
        input.close();


    }
    //method
    public static void Fibonacci(int a){
        System.out.println("Fibonacci series:-");
        int b=0;
        int c=1;
        int temp;
        System.out.print(b+","+c);
    
        
        while(c<=a){
            temp=b;
            b=c;
            c+=temp;
            if(c <= a){
                System.out.print(","+c);
            }
        }
    }
        

}
