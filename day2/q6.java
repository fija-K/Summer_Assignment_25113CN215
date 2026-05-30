package Summer_Assignment_25113CN215.day2;

import java.util.Scanner;
//Write a program to Reverse a number.
public class q6{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n = input.nextInt();
        Rev(n);
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
    static void Rev(int x){
        int z=x;
        int r=0;
        int y=Count_digit(x);
        while (!(z==0)) {
            r+=((int)Math.pow(10, (y-1)))*(z%10);
            y--;
            z/=10;

            
        }
        System.out.println("REV: "+r);

        
       
    }
}