import java.util.HashSet;
import java.util.Scanner;
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();//input
        HashSet<Character> set=new HashSet<>();
        StringBuilder ans =new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                ans.append(ch);
            }
        }
        System.out.println("After Removing Duplicates: "+ans);
        sc.close();
    }
}