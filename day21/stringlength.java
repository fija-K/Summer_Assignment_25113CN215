package day21;
import java.util.Scanner;

public class stringlength {

    //method to find length without using length()
    public static int findLength(String str) {
        int count=0;

        for(char ch : str.toCharArray()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        int len=findLength(str);

        System.out.println("Length = "+len);
    }
}