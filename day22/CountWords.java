package day22;

    import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ");

        String str=sc.nextLine().trim();
        int count=0;

        if (!str.isEmpty()) {
            count=1;
            for (int i=0;i<str.length();i++) {
                if (str.charAt(i)==' '&&str.charAt(i + 1)!= ' ') {
                    count++;
                }
            }
        }
        System.out.println("no of word"+count);
        sc.close();


    }
}
    

