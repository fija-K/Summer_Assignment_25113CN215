package Summer_Assignment_25113CN215.day4;

import java.util.Scanner;
//Write a program to Generate Fibonacci series.
public class q14{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n(n should be a natural no.");
        int n= input.nextInt();
        Fibonacci(n);
        
        input.close();


    }
    static void Fibonacci(int a){
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
