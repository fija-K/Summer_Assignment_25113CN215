package Summer_Assignment_25113CN215.day2;

import java.util.Scanner;
//Write a program to Find product of digits.
public class product_of_digits{
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n = input.nextInt();
        Mult_digit(n);
        input.close();


    }
    static void Mult_digit(int a){
        int d=a;
        int b=1;
        while(!(d==0)){
            b=b*(d%10);
            d/=10;
            

        }
        System.out.println("-->"+b);
    }
    
}