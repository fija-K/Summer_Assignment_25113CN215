package Summer_Assignment_25113CN215.day1;

import java.util.Scanner;
//Write a program to Count digits in a number
public class count_digits {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n = input.nextInt();
        Count_digit(n);
        input.close();


    }
    static void Count_digit(int a){
        int d=a;
        int b=0;
        while(!(d==0)){
            d/=10;
            b+=1;

        }
        System.out.println("no of digits in "+a+" is:"+b);
    }
}