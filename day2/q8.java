package Summer_Assignment_25113CN215.day2;

import java.util.Scanner;
//Write a program to Check whether a number is palindrome
//A palindrome is a word, phrase, number, or 
//sequence of symbols that reads exactly the same both forwards and backwards.
public class q8{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n = input.nextInt();
        Is_Palindrome(n);
        input.close();


    }
    static int Count_digit(int a){
        int d=a;
        int b=0;
        while(!(d==0)){
            d/=10;
            b+=1;

        }
        return b;
    }
    static int Rev(int x){
        int z=x;
        int r=0;
        int y=Count_digit(x);
        while (!(z==0)) {
            r+=((int)Math.pow(10, (y-1)))*(z%10);
            y--;
            z/=10;

            
        }
        return r;

        
       
    }
    static void Is_Palindrome(int x){
        int y=Rev(x);
        if (y==x){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
        
    }
    
}