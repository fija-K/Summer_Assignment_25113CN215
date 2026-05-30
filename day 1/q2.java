package Summer_Assignment_25113CN215.day1;

import java.util.Scanner;
//Write a program to Print multiplication table of a given number.
public class q2 {
    public static void main(){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE VALUE OF n");
        int n = input.nextInt();
        Table(n);
        input.close();


    }
    static void Table(int a){
        System.out.println("multiplication table of "+a+" is:");
        for (int i=1;i<=10;i++){
            System.out.println("->"+(i*a));
        }
    }
}