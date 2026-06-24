package day23;

import java.util.HashMap;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST STRING");

        String str1=sc.nextLine();//inputing string 1
        System.out.println("ENTER SECOND STRING");
        String str2=sc.nextLine();//inputing string 2

        if (str1.length()!=str2.length()) {
            System.out.println("Not anagram");
            return;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for (char ch : str1.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char ch : str2.toCharArray()) {

            if (!map.containsKey(ch)) {
                System.out.println("not anagram");
                return;
            }
            map.put(ch,map.get(ch) - 1);
            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }
        System.out.println(map.isEmpty() ? "anagram" : "not anagram");//conditoning and printing output

        sc.close();
    }
}