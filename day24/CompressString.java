import java.util.Scanner;

public class CompressString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();//input
        if (str.length()==0) {
            System.out.println("Empty String");
            return;
        }
        StringBuilder ans=new StringBuilder();
        int count=1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                ans.append(str.charAt(i));
                ans.append(count);
                count = 1;
            }
        }
        ans.append(str.charAt(str.length() - 1));
        ans.append(count);//appending
        System.out.println("Compressed String: " + ans);
        sc.close();
    }
}

