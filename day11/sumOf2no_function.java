package day11;

import java.util.Scanner;

public class sumOf2no_function {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter n1");
        int n1= input.nextInt(); 
        System.out.println("Enter n1");
        int n2= input.nextInt();
        sum(n1,n2);//method calling
        input.close();
        
    
    }
    //method
    public static void sum(int a, int b) {
        System.out.println(a+b);
        
    }
}
