
package day11;

import java.util.Scanner;
//Write a program to Check whether a number is prime
//same   as day3 question no 9th
public class prime_function{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Note:- PRIME NUMBER ARE ONLY DEFINE FOR NATURAL NUMBER GREATER THEN 1.");
        System.out.println("ENTER THE VALUE OF n(SHOULD BE A NATURAL NUMBER AND SHOULD BE GREATR THEN ONE)");
        boolean s=false;
        while (!s){
            int n = input.nextInt();
            if (n<=1){
                s=false;
                System.out.println("ENTER THE VALUE OF n(SHOULD BE A NATURAL NUMBER AND SHOULD BE GREATR THEN ONE)");
            }
            else{
                Is_Prime(n); //method calling
                s=true;
            }
            
        }
        
        input.close();


    }
    //method
    static void Is_Prime(int a){
        int d=a;
        int b=1;
        int c;
        int count=0;
        while(!(d==0)){
            c=d%b;
            if (c==d){
                break;
            }
            if (c==0){
                count++;


            }
            
            b++;
            

        }
        if (count>2){
            System.out.println("NOT PRIME");
        }
        else{
            System.out.println("PRIME");
        }
    }
}