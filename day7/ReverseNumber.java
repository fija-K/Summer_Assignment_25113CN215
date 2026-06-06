package day7;

import java.util.Scanner;

public class ReverseNumber {

    static int reversed =0;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter no: ");
        int num =input.nextInt();//taking input

        reverse(num);

        System.out.println("Reversed no= "+ reversed);
    }
    public static void reverse(int num) {

        if (num==0) {
            return;
        }

        reversed = reversed* 10 +(num % 10);

        reverse(num/10);


    }




}
