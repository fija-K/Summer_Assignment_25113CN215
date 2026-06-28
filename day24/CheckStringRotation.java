import java.util.Scanner;

public class CheckStringRotation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1=sc.nextLine();//inputing string 1
        System.out.print("Enter second string: ");
        String str2=sc.nextLine();//input
        if (str1.length()!=str2.length()) {
            System.out.println("Not a Rotation");
        } else {
            String temp=str1+str1;

            if (temp.contains(str2))
                System.out.println("Rotation");
            else
                System.out.println("Not a Rotation");
        }
        sc.close();
    }
}