package day22;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER WORD");

        String str = sc.nextLine();

        str = str.replaceAll("\\s+", "");
        System.out.println("final string: "+str);
        sc.close();
    }
}
