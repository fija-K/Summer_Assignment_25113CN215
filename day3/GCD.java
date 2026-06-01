package Summer_Assignment_25113CN215.day3;

import java.util.Scanner;
//Write a program to Find GCD of two numbers.
public class GCD{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NO(should be a natural no)");
        int n = input.nextInt();
        System.out.println("ENTER THE SECOND NO(should be a natural no)");
        int m = input.nextInt();
        GCD(n,m);
        
        input.close();



    }
    static void GCD(int a,int b){
        int gcd=0;
        int c;
        if (a>b){
            c=b;
        }
        else {
            c=a;
        }
        for (int i=1;i<=c;i++){
            if ((a%i==0)&&(b%i==0)){
                gcd=i;
            }
        }
        System.out.println("GCD:- "+gcd);
    }

        
}
