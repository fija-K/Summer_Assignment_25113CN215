package day21;

import java.util.Scanner;

public class reverseString {
     //Method to reverse string
    public static String reverse(String str) {
        String rev="";

        for(int i=str.length()-1;i>=0;i--) {
            rev+=str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("ENTER a string: ");
        String str=sc.nextLine();

        String ans=reverse(str);

        System.out.println("Reversed string = "+ans);
    }
}
