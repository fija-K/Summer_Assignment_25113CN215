package day21;   
import java.util.Scanner;

public class LowerToUpper {

    //Method to convert lowercase to uppercase
    public static String toUpper(String str) {
        String ans="";

        for(int i=0;i<str.length();i++) {
            char ch=str.charAt(i);

            //check if character is lowercase
            if(ch>='a' && ch<='z') {
                ch=(char)(ch-32);
            }
            ans+=ch;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String result=toUpper(str);
        System.out.println("Uppercase String = "+result);
    }
}