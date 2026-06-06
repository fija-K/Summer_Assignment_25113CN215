package day7;

import java.util.Scanner;

public class SumOfDigitsRecursive{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter no: ");
        int num = input.nextInt();//taking input

        int result = sumDigits(num);//calling of method and storing returned value.

        System.out.println("Sum of digits = " +result);


    }

    //method
    public static int sumDigits(int num) {//this function will return integer as 'int'

        if (num <10) {
            return num;
        }

        // Last digit + sum of remaining digits
        return ((num % 10) + (sumDigits(num / 10)));//returning..

   }



}



