package day23;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();//inputing string

        HashSet<Character> set=new HashSet<>();
        for (char ch:str.toCharArray()) {
            if (set.contains(ch)) {
                System.out.println("First repeating character: "+ch);
                return;
            }
            set.add(ch);
        }
        System.out.println("No repeating character found");

        sc.close();
    }
}