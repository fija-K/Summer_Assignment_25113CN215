package day6;

import java.util.Scanner;

public class exponent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Anatomy of an Expression \nBase: The number being multiplied.\nExponent: The superscript number indicating the quantity of multiplications.\nPower: The overall result of the operation.");
        System.out.print("enter base:");
        int b = input.nextInt();//taking input
        System.out.print("enter exponent");
        int e=input.nextInt();//taking input
        int power=b;

        for(int i=1;i<e;i++){
            power*=b;
            

        }
        System.out.println("POWER-> "+power);


        input.close();
    }
}
