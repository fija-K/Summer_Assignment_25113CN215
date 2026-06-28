import java.util.*;

public class CommonCharacters {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter first string: ");
        String s1=sc.nextLine();
        System.out.print("Enter second string: ");
        String s2=sc.nextLine();
        HashSet<Character> set=new HashSet<>();

        //store characters of second string
        for(int i=0;i<s2.length();i++){
            set.add(s2.charAt(i));
        }

        System.out.print("common Characters: ");
        HashSet<Character> printed=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(set.contains(ch)&&!printed.contains(ch)){
                System.out.print(ch+" ");
                printed.add(ch);
            }
        }
        sc.close();
    }
}