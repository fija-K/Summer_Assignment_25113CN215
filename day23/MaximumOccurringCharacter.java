package day23;

import java.util.HashMap;
import java.util.Scanner;

public class MaximumOccurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str=sc.nextLine();//inputing string

        HashMap<Character,Integer> map=new HashMap<>();

        //loop for putting all char to hashmap
        for (char ch:str.toCharArray()) {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        char maxChar=str.charAt(0);
        int maxFreq=0;

        for (char ch:str.toCharArray()) {
            if (map.get(ch)>maxFreq) {
                maxFreq=map.get(ch);
                maxChar=ch;
            }
        }



        System.out.println("Maximum occurring character: " +maxChar);
        System.out.println("Frequency: " +maxFreq);

        sc.close();
    }
}