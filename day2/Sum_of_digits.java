package Summer_Assignment_25113CN215.day2;

import java.util.Scanner;
//Write a program to Find sum of digits of a number.
public class Sum_of_digits {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n = input.nextInt();
        Sum_digit(n);
        input.close();


    }
    static void Sum_digit(int a){
        int d=a;
        int b=0;
        while(!(d==0)){
            b=b+d%10;
            d/=10;
            

        }
        System.out.println("sum of digits of "+a+" is:"+b);
    }
}